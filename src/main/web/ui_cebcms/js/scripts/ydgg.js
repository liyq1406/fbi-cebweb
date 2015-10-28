/**
 * Created by lenovo on 2015-10-28.
 */
    function AdvClick(){
        var a=1500;
        var b=3*1000;
        $(".dt_toSmall").click(function(){
            $(".dt_small").delay(a).slideDown(a);
            $(".dt_big").stop().slideUp(a);
            $(".dt_toSmall").stop().fadeOut(0);
            $(".dt_toBig").delay(a*2).fadeIn(0)
        });$
        (".dt_toBig").click(function(){
            $(".dt_big").delay(a).slideDown(a);
            $(".dt_small").stop().slideUp(a);
            $(".dt_toBig").stop().fadeOut(0);
            $(".dt_toSmall").delay(a*2).fadeIn(0)
        })
    }

function AdvAuto(){
    if($(".dt_big").length>0){
        var a=1500;
        var b=3*1000;
        $(".dt_big").delay(b).slideUp(a,function(){
            $(".dt_small").slideDown(a);
            $(".dt_toBig").delay(a).fadeIn(0)
        });
        $(".dt_toSmall").delay(b).fadeOut(0)
    }
}

