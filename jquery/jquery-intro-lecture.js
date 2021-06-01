"use strict";
// console.log(new Date());

// Intro to jQuery

// setup jQuery
// jquery - download
// jquery - cdn

// syntax
// let document = {
//     getElementById: function(){
//         console.log("find element with id of X")
//     },
//
// }
// document.getElementById()

// tapping into objects
// let school = {
//     students: 36,
//     name: "high school one",
//     teachers: ["Casey", "Tristan"],
//     getLunchMoney: function(){
//         console.log("you have X dollars left");
//     }
// }
// school.getLunchMoney();

// dollar sign - tapping into jQuery library
// selector - the element that you're selecting from the dom (html element)
// $("selector").methods(any arguments required);

// syntax - select by tag Name
// $("h1") //... --> select by tagName
// $("p").hide();

// syntax - selecting by id
// $("#change-text") //
// $("#change-text").hide();


//syntax - selecting by class
// $(".lead")
// console.log("-- before hiding purple")
// $(".purple").hide();
// console.log(" -- after hiding purple")
// // .show()
//
// console.log("--before showing purple")
// $(".purple").show();
// console.log("--after showing purple")
//
// // let myAge = 30;
// // console.log(`I can't believe I am ${myAge} years old!!`)
//
// // selecting children/parent/sibling elements
// console.log($("ul").children());

// console.log("add border class");
// $("#second").addClass("border");
// console.log("remove border class");
// $("#second").removeClass("border");
//
// // $(".purple-par").setAttribute(class, "border")
//
// let purPara = $(".purple-par");
// purPara.attribute("class", "border");

// $("div").addClass("red");

// select all children of any element that has a classname of border
// change the font-color
// 1. $("") select our main element
// $(".border").children().css({
//     "color": "blue",
//     "font-size": "24px"
// });
// // 2. select children of element that was selected
// // 3. css()  to chagne the css of the element(s) selected
// // 4. font-color to something new
//
//
// $(".row").css({
//     "display": "flex",
//     "justify-content": "flex-end",
//     "background-color": "blue"
// })


// mini exercise:

// window.onload
// javascript
// do something when the window is done loading
// ** it's going to wait for images
// window.onload = function (){
//     console.log(new Date());
//     console.log("hey window is done loading");
// }
//
// // document.ready
// // jquery
// // do something when the DOM is finished loading
// // won't wait for images
// // document won't need quotes
// //
//
// $(document).ready(function(){
//     console.log(new Date());
//     console.log("hey the DOM is finsihed loading")
// })

function tellTime(){
    console.log(new Date());
}

$(document).ready(tellTime());

console.log($("h1"));