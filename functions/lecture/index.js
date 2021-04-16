"use strict";

// /**** FUNCTIONS ****/

// // a function allows you to encapsulate your code into code blocks that will run only when you want it to run

// // BEFORE FUNCTIONS:
// var num1 = 5;
// var num2 = 4;
//  sum = num1 + num2;
// console.log(sum);

// // NOW LET'S WRAP IT IN A FUNCTION

// function add(num1 , num2){
//     return num1 + 5;
// }
//
// add(10);

// // LET'S LOOK AT THE FUNCTION SYNTAX

// // function is a keyword in javascript that will tell your code "hey we're about to write a function, so treat it as such
// // add is the name of the function - you can decide what you want to name your function, but you will reference it by this name whenever you're ready to call it
// // parentheses are require, and are going to hold your 'parameters'
// // parameters: num1 and num2 are called 'parameters' they are essentially 'placeholders' for any potential
// //incoming data that you will use inside of your function, you will also reference these values (data) with the
// // names given within the code. - you can name the parameters whatever you want!
// // you can also have as many parameters as you'd want
// // the curly brackets wraps around the code that will actually be executed
// function add(num1, num2) {
// // // your code will go here!
//     let sum = num1 + num2;
//     //// you must use the return keyword, which is going to actually return SOMETHING from a function
//     return sum;
// }
//
// // // this is how you tell your code to actually run this function and it will execute the block of code with the
// // passed in values (arguments)
// add(7,10);
//
// // // wrap it in a console.log() so we can see the results fo the function
// console.log(add(8,20));


// // // LETS SUBTRACT
// function subtract(num1,num2){
//     return num1-num2;
// }
//
// console.log(subtract(100, 28));

// // MINI EXERCISE
// // TODO: Create functions which will return the product (*) of two numbers and the dividend (/) of two numbers, respectively
//
// function multiply(num1, num2){
//     return num1 * num2;
// }
//
// function divide(num1,num2){
//     return num1/num2;
// }
//
// console.log(multiply(5,10));
// console.log(divide(15,5));

// // SCOPING

//  let -- has local scope, can be re-assigned
//  const -- cannot be reassigned
//  var -- has global scope, can be re-assigned

// // looks for required variables from 'inside - out'


// // FIND MY DOG

// function getKindOfDog(){
//     return prompt("what kind of dog is it?")
// };
//
// console.log(getKindOfDog());
//
// function getContactInfo(){
//     return prompt("How do I contact you when I find said dog?");
// }
//
// console.log(getContactInfo());
//
// function getDogName(){
//     return prompt("what's the poor lost dog's name?")
// }
//
// console.log(getDogName());
//
// function playTheGreatEscape(){
//     //// get all the info
//     var dogKind = getKindOfDog();
//     var dogName = getDogName();
//     var contactInfo = getContactInfo();
//
//     alert("time to search for this doggo!");
//     alert("I see a dog!")
//
//     var kindOfFoundDog =  getKindOfDog();
//
//     var isItTheLostDog = (kindOfFoundDog === dogKind) && confirm("Does it respond to the name: " + dogName);
//
//     if(isItTheLostDog){
//         alert("puts leash on: "+ dogName);
//         alert("time to call the owner!");
//         alert("Calling " + contactInfo);
//     }
//
// }
//
// playTheGreatEscape();

let myIffe = (function (){
       let product = 5*5;
       // console.log(product);
       return product;
})()

console.log(myIffe);
