/**
 * Created by Administrator on 2015/10/20.
 */

//首页右侧图片播放
function slider(s){this.init.apply(this,arguments)}
slider.prototype={
    init:function(s){
        this.o=this.getByClass(s)[0];
        this.l=this.getByClass('slider_pic',this.o)[0].getElementsByTagName('li');
        this.b=this.getByClass('slider_btn',this.o)[0];
        this.bSpan=this.b.getElementsByTagName('span');
        this.len=this.l.length;
        this.iNum=1;
        this.status();//初始化状态
        this.autoPlay();//自动播放
        this.clickPlay();//点击按钮播放
        this.suspensionPause();//鼠标悬浮暂停
    },
    clickPlay:function()
    {
        var This=this;
        for(var i=0;i<this.len;i++)
        {
            this.bSpan[i].index=i;
            this.bSpan[i].onclick=function()
            {
                clearInterval(This.timer);
                var index=this.index;
                This.iNum=(index+1) == This.len ? 0 : (index+1)  ;
                var o=This.l[index];
                This.setLayout(this,o);
                This.autoPlay();
            }
        }
    },
    suspensionPause:function()
    {
        var This=this;
        for(var i=0;i<this.len;i++)
        {
            this.l[i].onmouseover=function()
            {
                clearInterval(This.timer);
            }
            this.l[i].onmouseout=function()
            {
                This.autoPlay();
            }
        }
    },
    setLayout:function(o1,o2){
        for(var j=0;j<this.len;j++)
        {
            if(this.bSpan[j]!=o1)
            {
                this.bSpan[j].className='';
                this.l[j].style.zIndex=j;
            }
        }
        o2.style.zIndex=this.len;
        o2.style.left='600px';
        this.doMove(o2,0);
        o1.className='cur';
    },
    status:function(){
        for(var i=this.len;i--;i>0)
        {
            this.l[i].style.zIndex=i;
            this.bSpan[i].className='';
        }
        this.l[0].style.zIndex=this.len;
        this.bSpan[0].className='cur';
        this.b.style.zIndex=(this.len+1);
    },
    autoPlay:function(){
        this.timer=null;
        var This=this;
        this.timer=setInterval(function(){
            This.setLayout(This.bSpan[This.iNum],This.l[This.iNum])
            This.iNum++;
            if(This.iNum==This.len)
            {
                This.iNum=0;
            }
        },4500)
    },
    getByClass:function(s,p){
        var reg=new RegExp('(\\b)'+s+'(\\b)');
        var aResult=[];
        var aElement=(p || document).getElementsByTagName('*');
        for(var i=0;i<aElement.length;i++)
        {
            reg.test(aElement[i].className) && aResult.push(aElement[i])
        }
        return aResult;
    },
    doMove:function(o,t)
    {
        clearInterval(o.timer);
        o.timer=setInterval(function(){
            var iS=(t-o.offsetLeft)/8;
            iS=iS>0?Math.ceil(iS):Math.floor(iS);

            if(o.offsetLeft==t)
            {
                clearInterval(o.timer);
            }
            else
            {
                o.style.left=o.offsetLeft+iS+"px";
            }

        },30)
    }

}
var slide=new slider('slider');

//点击图片放大

(function(win){
    function myslider(elem,isZoom,src){
        this.elem=typeof elem=='object' ? elem : this.$$('slider')[0];
        this.isShow=false;
        this.aImages=this.elem.getElementsByTagName('img');
        this.index=0;
        this.src=src || '_src';
        this.isZoom=typeof isZoom=='undefined' ? true : isZoom;
        this.len=this.aImages.length;
        this.showPopup();
    };
    var slider=myslider.prototype;
    //============显示弹出层
    slider.showPopup=function(){
        var self=this,
            img=this.aImages;
        for(var i=0;i<this.len;i++){
            img[i].index=i;
            img[i].onclick=function(){
                self.index=this.index;
                self.createPopup(this.getAttribute(self.src),this.getAttribute('_title'));
            }
        }
    };
    //===========class获取元素
    //params  s 类名
    //params  t 节点名
    //params  p  父辈以上节点 dom对象
    slider.$$=function(s,t,p){
        var aElement=(p||document).getElementsByTagName(t||'*'),
            reg=new RegExp('(^|\\s)'+s+'(\\s|$)'),
            aResult=[];
        for(var i=0;i<aElement.length;i++){
            reg.test(aElement[i].className) && aResult.push(aElement[i]);
        };
        return aResult;
    };
    //==============创建弹出层展示
    //params   src  图片路径
    //params title  显示文字
    slider.createPopup=function(src,title){
        var oPopup=document.createElement('div');//弹出层外框
        var oMask=document.createElement('div');//遮罩
        var oPrev=document.createElement('div');//上按钮
        var oNext=document.createElement('div');//下按钮
        var oBottom=document.createElement('div');//底部盒子
        var oTitle=document.createElement('div');//底部文字盒子
        var oTitleTxt=document.createElement('div');
        var oClose=document.createElement('div');//关闭
        var oImg=document.createElement('img');//图片

        oMask.className='mask';
        oPopup.className='popup';
        oPrev.className='prev btn';
        oNext.className='next btn';
        oBottom.className='popupBottom';
        oTitle.className='popupTitle';
        oClose.className='popupClose';

        oTitle.innerHTML=title || '';

        var  vw=document.documentElement.clientWidth,
            vh=document.documentElement.clientHeight;

        oPopup.style.margin='0';
        oPopup.style.left=(vw-320)/2+'px';
        oPopup.style.top=(vh-240)/2+'px';

        this.hide(oPrev);
        this.hide(oNext);
        this.hide(oBottom);
        this.hide(oClose);
        this.hide(oImg);

        oBottom.appendChild(oClose);
        oBottom.appendChild(oTitle);
        oPopup.appendChild(oPrev);
        oPopup.appendChild(oNext);
        oPopup.appendChild(oImg);
        oPopup.appendChild(oBottom);
        document.body.appendChild(oMask);
        document.body.appendChild(oPopup);

        var self=this;
        oImg.onload=function(){
            self.show(this);
            self.show(oClose);
            self.show(oBottom);
            self.show(oNext);
            self.show(oPrev);
            this.style.height='auto';
            this.style.width='auto';

            var w=this.width,docH=self.getFullHeight();
            var oldw=self.css(oPopup,'width'),oldh=self.css(oPopup,'height');

            oPopup.style.height='auto';
            oPopup.style.width='auto';
            oPopup.style.opacity=0;
            oPopup.style.filter='alpha(opacity:0)';
            oMask.style.height=docH+'px';

            var h=oPopup.clientHeight;
            w=oPopup.clientWidth;
            oPopup.style.height=oldh;
            oPopup.style.width=oldw;
            self.hide(oBottom);
            self.hide(oImg);
            self.move(oPopup,{opacity:100,height:h,width:w,left:parseInt((vw-w)/2),top:parseInt((vh-h)/2)},5,function(){
                self.show(oBottom);
                self.show(oImg);
                oImg.style.width='100%';
                self.isShow=true;
            });
        };

        self.move(oMask,{opacity:60},5);

        oImg.src=src;
        this.prev=oPrev;
        this.next=oNext;
        this.close=oClose;
        this.img=oImg;
        this.txt=oTitle;
        this.btm=oBottom;
        this.p=oPopup;
        this.mask=oMask;


        this.nexts();
        this.prevs();
        this.stopPropagation();
        this.closes();
        this.isZoom && this.mouseWheels();
        this.resizefn();
    };
    //============重置窗口大小
    slider.resizefn=function(){
        if(!this.p)return;
        var self=this;
        this.addEvent(window,'resize',function(){
            if(!self.p)return;
            var viw=document.documentElement.clientWidth,
                vih=document.documentElement.clientHeight,
                h=self.p.offsetHeight,w=self.p.offsetWidth;
            self.p.style.left=(viw-w)/2+'px';
            self.p.style.top=(vih-h)/2+'px';
            self.mask.style.height=Math.max(self.mask.offsetHeight,vih)+'px';
            self.mask.style.width=Math.max(self.mask.offsetWidth,viw)+'px';
        })
    };
    //==============鼠标滚轮
    slider.mouseWheels=function(){
        this.addEvent(document,'mousewheel',wheel);
        this.addEvent(document,'DOMMouseScroll',wheel);
        var self=this;
        var isBeyond=false;

        function wheel(e){
            var ev=window.event||e,flag=true,
                h=self.img.height,w=self.img.width,
                l=self.p.offsetLeft,t=self.p.offsetTop,
                scale=h/w,
                nw=Math.round(20/scale),
                txtH=Math.max(self.btm.offsetHeight,22)+8,
                viw=document.documentElement.clientWidth-80,
                vih=document.documentElement.clientHeight-50,
                maxH=self.p.offsetHeight,
                maxW=self.p.offsetWidth;

            //FF detail 往上小于0,往下大于0;
            //IE wheelDelta 往上大于0,往下小于0
            flag=ev.wheelDelta ? ev.wheelDelta<0 : ev.detail>0;

            if(maxW>=viw || maxH>=vih){
                isBeyond=true;
            };

            switch(flag)
            {
                //往下
                case true:
                    if(h<150 || w<200)return;
                    h-=20;
                    w-=nw;
                    l+=nw/2;
                    t+=10;
                    isBeyond=false;
                    break;
                default :  //往上
                    h+=20;
                    w+=nw;
                    l-=nw/2;
                    t-=10;
            };
            if(!isBeyond){
                self.css(self.p,'height',h+txtH);
                self.css(self.p,'left',l);
                self.css(self.p,'width',w);
                self.css(self.p,'top',t);
                ev.preventDefault && ev.preventDefault();
            }

            return false;
        }
    };
    //==============阻止冒泡
    slider.stopPropagation=function(){
        this.p.onclick=function(ev){
            var e=window.event||ev;
            e.stoppropagation ? e.stopPropagation() :(e.cancelBubble=true);
        }
    };
    //
    //=============隐藏
    slider.hide=function(o){
        o.style.display='none';

    };
    //=============显示
    slider.show=function(o){
        o.style.display='block';
    };
    //==============绑定事件
    //params  o dom对象
    //params  type 事件类型
    //params  fn   事件函数
    slider.addEvent=function(o,type,fn){
        return o.addEventListener ? o.addEventListener(type,fn,false) : o.attachEvent('on'+type,fn);
    };
    //==============解除事件绑定
    slider.removeEvent=function(o,type,fn){
        return o.detachEvent ? o.detachEvent('on'+type,fn) : o.removeEventListener(type,fn);
    };
    //==============关闭
    slider.closes=function(){
        var self=this;
        document.onclick=this.close.onclick=function(){
            if(!self.isShow)return;
            self.move(self.mask,{opacity:0},5,function(){
                document.body.removeChild(self.mask);
            });
            document.body.removeChild(self.p);
            self.isShow=false;
            delete self.p,self.prev,self.next,self.close,self.img,self.txt,self.btm,self.mask;
            self.img.onload=null;
        };
    };
    //==============点击上一张
    slider.prevs=function(){
        var self=this;
        this.prev.onclick=function(){
            var index=--self.index;
            if(index<0){
                index=self.index=self.len-1;
            };
            self.clickSwitch(index);
        }
    };
    //==============点击下一张
    slider.nexts=function(){
        var self=this;
        this.next.onclick=function(){
            var index=++self.index;
            if(index>=self.len){
                index=self.index=0;
            };
            self.clickSwitch(index);
        }
    };
    //================点击切换公有代码
    slider.clickSwitch=function(i){
        var h=this.hide;
        h(this.prev);
        h(this.next);
        h(this.close);
        h(this.btm);
        h(this.img);
        this.img.src=this.aImages[i].getAttribute(this.src);
        this.txt.innerHTML=this.aImages[i].getAttribute('_title');
    }
    //=============缓冲运动
    //params  o    dom对象
    //params  json 散列表
    //params  fx   Boolean值
    //params  fn   回调函数,可选
    slider.move=function(o,json,fx,fn){
        var self=this;
        o.timer && clearInterval(o.timer);
        o.timer=setInterval(function(){
            var bStop=true;
            var cur=0;
            for(var attr in json){
                cur=attr=='opacity' ? parseInt(parseFloat(self.css(o,attr)).toFixed(2)*100):parseInt(self.css(o,attr));
                var speed=(json[attr]-cur)/fx;
                speed=speed>0?Math.ceil(speed):Math.floor(speed);
                if(attr=='opacity'){
                    o.style.filter='alpha(opacity:'+(speed+cur)+')';
                    o.style.opacity=(speed+cur)/100;
                }else{
                    o.style[attr]=(cur+speed)+'px';
                }
                if(cur!=json[attr]){
                    bStop=false;
                }
                if(bStop){
                    clearInterval(o.timer);
                    (typeof fn=='function')&&fn();
                }
            }
        },30)
    };
    //=============获取元素样式
    //params  o    dom对象
    //params  attr 属性
    slider.css=function(o,attr,val){
        if(arguments.length==2){
            return o.currentStyle ? o.currentStyle[attr] : getComputedStyle(o,false)[attr];
        }
        else
        {
            o.style[attr]=val+'px';
        }

    };
    //=============获取页面高度
    slider.getFullHeight=function(){
        var sh=document.body.scrollHeight,
            ch=document.documentElement.clientHeight;
        return  Math.max(sh,ch);
    };
    win.myslider=myslider;
})(window);


var taotao=new myslider('lightBox');

//第一个参数传入dom对象或class,如给页面所有图片加显示传入 document (注意别加引号);
//第二个参数boolean ,是否开启鼠标滚轮缩放 ,默认开启,可选
//第三个参数是图片真实路径,默认 '_src'  可选
//lightBox.init(o,isZoom,src);
//注意要显示的图片尺寸不能太小,否则不好看了。