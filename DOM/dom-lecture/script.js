// DOM
let school = {
    teacher: "Casey",
    students: 38,
    // objects can also hold functions
    // methods
    getNumStudents: function (){
        console.log(`num of students is: ${this.students}`);
    }
}

// // print teacher's name
// console.log(school.teacher);
// console.log(school.students);
// console.log(school.getNumStudents());



// retrieving elements

// by id

let lightGreenElement = document.getElementById("light-green");
// console.log(lightGreenElement);

// what's returned?
// the entire element --> node element



// by className
// // print out all elements with class of red
let red = document.getElementsByClassName("red");
// console.log(red);

// what's returned?
// HTML Collection --> array of all the elements with that class name
// (even if there's only 1 element with that class name
// use loop to access items inside of array *******



// get by Tag Name
let par = document.getElementsByTagName("p");
// console.log(typeof par);
// get ALL elements

// what's returned?
// HTML Collection --> array

// MINI EXERCISE
// 1.
let redBrd = document.getElementById("red-border");
// console.log(redBrd);

//2. print an arr of elements whose text is dark green
let drkGrn = document.getElementsByClassName("drk-grn")
// console.log(drkGrn);

// 3. print an array of ALL paragraphs
let allPars = document.getElementsByTagName("p");
// console.log(allPars);

// ADDING ELEMENTS

// MANIPULATING ATTRIBUTES USING DOM
let firstBlue = document.getElementsByClassName("blue-bkg")[0];
console.log(firstBlue);

firstBlue.removeAttribute("class");
firstBlue.setAttribute("class", "col-3");


// STYLE ELEMENTS

let yellowDiv = document.getElementById("yellow-border");
console.log(yellowDiv);

yellowDiv.style.border = "6px solid #f8f8f8";
yellowDiv.style.color = "blue";

console.log(yellowDiv.childNodes[0]);

// // change inner contents
let yellowPar = document.getElementById("change-txt");
console.log(yellowPar.innerText);
yellowPar.innerText = "hello world";


// console.log(document.getElementsByClassName("innerHTML")[0].innerHTML);
//
//
// let newEl = document.createElement((p))
// document.getElementsByClassName("innerHTML")[0].innerHTML = "new text"
//
// // CREATE ELEMENT
//
// // 1. create element
//    let newEl =  document.createElement("p");
// console.log(newEl);
//
// // 2. change its innerText
// newEl.innerText = "hello this my new paragraph";
// console.log(newEl);
//
// // // INNER HTML
// let pizzaForm = document.getElementsByClassName("pizza");
// console.log(pizzaForm[0]);
// pizzaForm[0].innerHTML = "hello";
// console.log(pizzaForm[0]);

//
// // 1. create a new div
// let newDiv = document.createElement("div");
// console.log(newDiv);
// // 2. create an ul
// let newUl = document.createElement("ul");
// console.log(newUl);
// // 3. change text of an element
// newDiv.innerText = "this is a brand new div";
// console.log(newDiv);
// // 4. change innerHTML
// newDiv.innerHTML = "";
// console.log(newDiv);
// // // append - adding elements to other elements

//create paragraph element
let newPars = document.createElement("p");
// change its inner text
newPars.innerText = "hello world";
//adding a class
newPars.setAttribute("class", "border");
console.log(newPars);

// creating a new div element AND appending our newly created p element
let newContainer = document.createElement("div")
newContainer.setAttribute("class", "container");
console.log(newContainer);



// newContainer.appendChild(newPars);
// console.log(newContainer);
// //
// let existingDivs = document.querySelector(".toBeFilled");
// console.log(existingDivs);
// document.querySelector("body").appendChild(newContainer);
//
//
// // you don't have to be AS specific when using querySelector or
// // querySelectorAll to select elements
// //querySelector --> node , returns first of the thing you're looking
// // for (searches from top to bottom)
// //querySelectorAll --> you don't have to
// //getElementsByClassName --> HTMLCollection
//
//
// // Removing Children
// // node.removeChild(child)
// // 1. select our element
// let faveList = document.querySelector("ul") // lii with id of cats
// console.log(faveList[0]);
// faveList.removeChild(document.getElementById("cats"));
// console.log(faveList);

let existingDivs = document.querySelector(".toBeFilled");
console.log(existingDivs);

var el = document.createElement('p');


// append to the element's content
existingDivs.innerHTML += el;

// prepend to the element's content
el.innerHTML = '<p>Hello World!</p>' + el.innerHTML;

// 3. append it as a child to a parent element

