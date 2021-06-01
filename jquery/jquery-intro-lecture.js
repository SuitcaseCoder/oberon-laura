"use strict";

// Intro to jQuery

// setup jQuery
// jquery - download
// jquery - cdn

// syntax

// syntax - select by className

// syntax - selecting by id

//syntax - selecting by class

// mini exercise:

// window.onload
window.onload = function(){
    alert("The window has finished loading");
    console.log("--- window done loading at: ----");
    console.log(new Date());
}

// document.ready
$(document).ready(function(){
    alert("the DOM has finished loading");
    console.log("--- DOM finished loading at: ---");
    console.log(new Date());
});