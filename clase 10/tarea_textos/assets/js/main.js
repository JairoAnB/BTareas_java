$("#text1").mouseover(function () {
  $("#text2").css("display", "block");
});

$("#text1").mouseout(function () {
  $("#text2").css("display", "none");
});
$("#img").click(function (e) {
  e.preventDefault();
  $("#img").css("width", "100%");
});
$("#img").mouseout(function () {
  $("#img").css("width", "20%");
});
$("#caja3").dblclick(function () {
  $("#caja3").css("font-size", "30px");
});

$("#caja3").mouseout(function () {
  $("#caja3").css("font-size", "20px");
});
