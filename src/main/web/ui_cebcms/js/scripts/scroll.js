
    lastScrollY = 0;
function heartBeat(){
    var diffY;
    if (document.documentElement && document.documentElement.scrollTop)
        diffY = document.documentElement.scrollTop;
    else if (document.body)
        diffY = document.body.scrollTop
    else
    {/*Netscape stuff*/}

//alert(diffY);
    percent=.1*(diffY-lastScrollY);
    if(percent>0)percent=Math.ceil(percent);
    else percent=Math.floor(percent);
    document.getElementById("leftDiv").style.top = parseInt(document.getElementById("leftDiv").style.top)+percent+"px";
    document.getElementById("rightDiv").style.top = parseInt(document.getElementById("leftDiv").style.top)+percent+"px";
    lastScrollY=lastScrollY+percent;
//alert(lastScrollY);
}
//下面这段删除后，对联将不跟随屏幕而移动。
window.setInterval("heartBeat()",1);
//-->

function lefthiden(){
        document.getElementById('leftDiv').style.display='none';
}
function righthiden(){
        document.getElementById('rightDiv').style.display='none';
 }
