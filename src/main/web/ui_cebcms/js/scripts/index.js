/**
 * Created by Administrator on 2015/10/20.
 */
alert("123123123");
//????????????
function slider(s){this.init.apply(this,arguments)}
slider.prototype={
    init:function(s){
        this.o=this.getByClass(s)[0];
        this.l=this.getByClass('slider_pic',this.o)[0].getElementsByTagName('li');
        this.b=this.getByClass('slider_btn',this.o)[0];
        this.bSpan=this.b.getElementsByTagName('span');
        this.len=this.l.length;
        this.iNum=1;
        this.status();//???????
        this.autoPlay();//???????
        this.clickPlay();//??????????
        this.suspensionPause();//??????????
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

//????????

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
    //============?????????
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
    //===========class??????
    //params  s ????
    //params  t ?????
    //params  p  ?????????? dom????
    slider.$$=function(s,t,p){
        var aElement=(p||document).getElementsByTagName(t||'*'),
            reg=new RegExp('(^|\\s)'+s+'(\\s|$)'),
            aResult=[];
        for(var i=0;i<aElement.length;i++){
            reg.test(aElement[i].className) && aResult.push(aElement[i]);
        };
        return aResult;
    };
    //==============????????????
    //params   src  ??·??
    //params title  ???????
    slider.createPopup=function(src,title){
        var oPopup=document.createElement('div');//?????????
        var oMask=document.createElement('div');//????
        var oPrev=document.createElement('div');//????
        var oNext=document.createElement('div');//?°??
        var oBottom=document.createElement('div');//???????
        var oTitle=document.createElement('div');//??????????
        var oTitleTxt=document.createElement('div');
        var oClose=document.createElement('div');//???
        var oImg=document.createElement('img');//??

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
    //============????????С
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
    //==============??????
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

            //FF detail ????С??0,???????0;
            //IE wheelDelta ???????0,????С??0
            flag=ev.wheelDelta ? ev.wheelDelta<0 : ev.detail>0;

            if(maxW>=viw || maxH>=vih){
                isBeyond=true;
            };

            switch(flag)
            {
                //????
                case true:
                    if(h<150 || w<200)return;
                    h-=20;
                    w-=nw;
                    l+=nw/2;
                    t+=10;
                    isBeyond=false;
                    break;
                default :  //????
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
    //==============??????
    slider.stopPropagation=function(){
        this.p.onclick=function(ev){
            var e=window.event||ev;
            e.stoppropagation ? e.stopPropagation() :(e.cancelBubble=true);
        }
    };
    //
    //=============????
    slider.hide=function(o){
        o.style.display='none';

    };
    //=============???
    slider.show=function(o){
        o.style.display='block';
    };
    //==============?????
    //params  o dom????
    //params  type ???????
    //params  fn   ???????
    slider.addEvent=function(o,type,fn){
        return o.addEventListener ? o.addEventListener(type,fn,false) : o.attachEvent('on'+type,fn);
    };
    //==============????????
    slider.removeEvent=function(o,type,fn){
        return o.detachEvent ? o.detachEvent('on'+type,fn) : o.removeEventListener(type,fn);
    };
    //==============???
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
    //==============????????
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
    //==============????????
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
    //================????л????д???
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
    //=============???????
    //params  o    dom????
    //params  json ??б?
    //params  fx   Boolean?
    //params  fn   ???????,???
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
    //=============?????????
    //params  o    dom????
    //params  attr ????
    slider.css=function(o,attr,val){
        if(arguments.length==2){
            return o.currentStyle ? o.currentStyle[attr] : getComputedStyle(o,false)[attr];
        }
        else
        {
            o.style[attr]=val+'px';
        }

    };
    //=============????????
    slider.getFullHeight=function(){
        var sh=document.body.scrollHeight,
            ch=document.documentElement.clientHeight;
        return  Math.max(sh,ch);
    };
    win.myslider=myslider;
})(window);



var taotao=new myslider('lightBox');

//?????????????dom?????class,????????????????????? document (?????????);
//?????????boolean ,??????????????? ,??????,???
//?????????????????·??,??? '_src'  ???
//lightBox.init(o,isZoom,src);
//?????????????粻???С,?????????