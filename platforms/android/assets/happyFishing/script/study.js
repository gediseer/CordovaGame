/**
 * Created by root on 17-3-16.
 */

onerror = handlerErr;
var txt = "", c_start;

function handlerErr(msg, url, l) {
    alert("msg=" + msg + '\n' + "url=" + url + '\n' + "l=" + l);
    txt += msg + '\n';
    txt += url + '\n';
    txt = +l;
    var xx = txt;
    console.log("this is a log")
}

$(document).ready(function(){
    $(".flip").click(function(){
        $(".panel").slideToggle("slow");
    });
});