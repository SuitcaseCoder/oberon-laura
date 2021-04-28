"use strict";

/*** OBJECTS ***/


/** INTRODUCTION **/

// // What is an object?
////
//  var laptop = {
//         color: 'space gray',
//         make: 'mac',
//         size: 13,
//         turnsOn: function(){
//             return 'turn the comptur on';
//         }
//     }

// var string = "hello world";
//  console.log(string.length);


//  // New Object Instance

//     var losSpurs = new Object();
//     console.log(typeof losSpurs);
//
// // // TODO: create an empty 'aboutMe' object using the `new` keyword and the Object() constructor
//
// //  // Object Literal:
//     var theSpurs = {};
//
// console.log(typeof theSpurs);

// // TODO: create an empty 'thisIsMe' object using object literal syntax


// // what is a custom object?
// //


// // Setting properties within object
// // okay, now let's add some information to our objects
// var greeting = `hello world, my name is`;
// console.log(greeting);
//
// var thisIsMe = {
//     name: "Laura",
//     faveFood: "pizza",
//     age: 30,
//     city: "San Antonio",
//     yrBorn: 1990
// };

// // using dot notation (losSpurs)
// var losSpurs = new Object();
// console.log(losSpurs);
//
// // // nameOfObject.nameOfProperty = value
// losSpurs.coach = "Gregg";
// losSpurs.mascot = "coyote";
// losSpurs.fans = "the best";
// console.log(losSpurs);

// // bracket notation
// var daMavs = {};

// // brackets and quotes
// // nameOfObject[nameOfProperty];

// daMavs["city"] = "Dallas";
// daMavs["wins"] = 1;
// console.log(daMavs)
//
// // var sport = "tennis";
//
// var Federer = {
//     name: "Roger",
//     city: "Bern",
//    opensWon: 15
// }
// // prompt 'whats your fave sport'
// var sport = "tennis";
// Federer[sport] = sport;
// console.log(Federer)

// var rogerFederer = {
//     name: "Roger",
//     city: "Bern",
//    opensWon: 15
// }
//
// rogerFederer.city = "LA";
// console.log(rogerFederer["city"]);
//
// //syntax:
// // nameOfObject.nameOfProperty--> this creates the property within the object
// var theSpurs = {
//     city: "San Antonio",
//     coach: 'Gregg',
//     wins: 5,
//     isBestTeam: true
// }


// // your turn!
// // TODO: let's add a 'city', 'coach', and 'sport' property to our 'losSpurs' object using dot
//  notation and then print the 'losSpurs' object


// // using array notation (theSpurs)

// // syntax:
// // nameOfObject["nameOfProperty"] --> this creates a property within the object

// //  your turn!
// // TODO: let's add 'numOfPlayers', 'numOfChampsWon', and 'isBestTeam' properties to our same
//  'losSpurs' object, using bracket notation. don't forget to assign values to these properties


// // what's the difference between dot and bracket (array) notation?
// // bracket notation - quotes around the property name

// USING BRACKET:
// let bracketObj = {
//     one: 'meow',
//     two: 'woof'
// };
//
// let three = 'one';
//
// let sound = bracketObj[three]; // "meow"
// let soundTwo = bracketObj["two"]; // 'woof'
// // let sound = bracketObj['cat'];
// console.log(sound, soundTwo); //



// // USING DOT
// let obj = {
//     cat: 'meow',
//     dog: 'woof'
// };
// let dog = 'cat';
// let sound = obj.dog;
// console.log(sound);


// // Avoid doing this:


// should instead be:




// // Accessing Information within Objects
// // DOT NOTATION

// // return just the value of the spurs' coach
// var losSpurs ={};
// losSpurs.city = "San Antonio";
// losSpurs.coach = "Greg";
// losSpurs.sport = "basketball";
// console.log(losSpurs);
//
// console.log(losSpurs.coach);
// console.log(typeof losSpurs.city);


// // ARRAY NOTATION
// console.log(`${losSpurs.coach}`);
// console.log(losSpurs.coach);
// console.log(losSpurs["coach"]);

// // Re-assigning values inside of objects
// losSpurs.coach = "Gregg";
// console.log(losSpurs);



// // Nested Values

var animals = [{type: "dog", legs: 4}, {type: "fish", legs: 0}];
// console.log(animals);

var theSpurs = {
    city: "SA",
    coach: 'gregg',
    wins: 5,
    players: ["one", "two", "tim duncan", "manu", "david robinson"],
    playerInfo: [
        {
            name: "Tim",
            age: 40,
            mvp: 3
        },
        {
            name: "manu",
            age: 38,
            mvp: 6
        }
    ],
    otherNBATeams: {
        Jazz: {
            city: "Salt Lake City",
            mascot: "Jazz Bear",
            champsWon: 0
        },
        Mavs: {
            city: "Dallas",
            mascot: "MavsMan & Champ",
            champsWon: 1
        },
        Pistons: {
            city: "Detroit",
            mascot: "Hooper the Horse",
            champsWon: 3
        }
    }
}

console.log(theSpurs.otherNBATeams.Mavs);
// console.log(theSpurs.playerInfo[0].age);
// console.log(theSpurs);

// TODO: using above nested object, log the mascot of the "otherNBATeams", change "manu's" name
//  from "manu" to "Ginobli", print out the 3rd element in the 'players' array, add another
//  'otherNBATeam' team object.


// // Assigning Functionality

 // var laptop = {
 //        color: 'space gray',
 //        make: 'mac',
 //        size: 13,
 //        // method
 //        // // property name becames the name of the function
 //        shutDown: function (){
 //            return "laptop is shutting down";
 //        }
 //    }

//  // // let's shut our laptops off
// console.log(laptop.shutDown());
//
//  // // turn your laptop back on
// laptop.turnOn = function turnOn(){
//     return "laptop is now starting";
// }
// console.log(laptop.turnOn());
// console.log(laptop);
 // var arr = [3,6,8,9];
 // arr.forEach(num => {
 //     console.log(num)
 // })




// // THIS keyword

// var laptop = {
//     color: 'space gray',
//     make: 'mac',
//     size: 13,
//     whatSize: function (){
//         return `A laptop is ${this.size} inches wide`;
//     },
//     keyboard: {
//
//         spacebar: {
//             size: 15,
//             whatSize: function(){
//                 console.log(this);
//                 return `a ${this.size}-inches wide laptop is great!`
//             }
//         }
//     }
// }
// console.log(laptop.whatSize()); //first
// console.log(laptop.keyboard.spacebar.whatSize()); //first

// var inches = laptop.size;
// console.log(laptop.whatSize(inches));






/** Mini Exercises */
/*  TODO: Create a zoo object that contains basic info about the zoo (name, city,
      isOpen, ranking, yearOpened), as
      well as, information about at least 5 different animals (think nested objects). For each
      Each animal must contain 3 identifiers (examples: hasFur, isMammal, animalSound, canFly,
       livingPlace). Each animal must also contain a method that returns the sound of that
        animal using the THIS keyword.
       hint: Each animal should have at least 5 properties (one of them being animalSound);
*/


/*
*  TODO:
*   Exercise 1. Write a function called makeCar that takes in two strings, make and model, and returns an object with those properties
// Example: makeCar("VW", "beetle") returns the object {"make": "VW", "model", "beetle"}

// Exercise 2. Use the following data to create an object named salesReport.
//     The object should have the following properties:
//       title, date, office, and employees.
//       the employees property should hold an array of objects.
//       each employee should be represented by an object with the following properties:
//         employee-number, first-name, last-name, sales-units
//
// Monthly Sales Report
// Date: 03-17-2015
// Office: Codeup
// ===================================================
// Employee Number, First Name, Last Name, Sales Units
// ***************************************************
// 1, Jane, Janeway, 3
// 3, Tricia, Triciason, 5
// 4, Jeannette, Jeanson, 4
// 5, Charles Emmerson III, Winchester, 2
// 6, Chet, Chedderson, 8
// 7, Chaiam, Chaiamson, 12
// 8, Dale, Dalesinger, 1
// 9, Zig, Ziglar, 50
// 10, Henry, Kissinger, 1
// 11, Arthur Herbert, Fonzarelli, 23
// 12, Betty, Boop, 67

// Exercise 3. On the salesReport object you made, add the following methods.
// getEmployeeCount() should return the total number of employees
// getTotalNumberOfSales() should return the total number of units sold
// getAverageSalesPerEmployee() should return the average units sold per employee
*
* */


/** MATH **/

// // Math.random();

// // random num between 0 and 1;
// var random = Math.random();
// console.log(random);
// //
// // // now let's remove the decimals using toFixed - an existing js method
// var fixed = random.toFixed(2);
// console.log(fixed)
// //
// // //  now let's get a whole number between 20 and 40
// // PEMDAS: please excuse my dear aunt sally
// var inBetween = Math.floor(Math.random() * (40 - 20 + 1) + 20);
// console.log(inBetween);
// //
// // // let's break it down:
// console.log(40 - 20 + 1); // 21
// console.log(21 + 20); // 41
// console.log(Math.random() * 41);
// // // make sure to replace what's being passed in to floor with actual random num;
// console.log(Math.floor(2.8176061648139354
// ));
// console.log(Math.random() * 40);
//
//
// // // TODO:
//
// // // Math.round();
// console.log(Math.round(8.245)); //
// console.log(Math.round(9.872123)) //
// console.log(Math.round(Math.random())); // what will you expect to see?
//
// // // Math.floor();
// console.log(math.floor(7.90));
// console.log(Math.floor(8.245)); // note difference between round()
// console.log(Math.floor(9.872)) // should round up
// //
//
// // // Math.ceil();
// console.log(Math.ceil(7.90));
// console.log(Math.ceil(8.245)); // note difference between round()
// console.log(Math.ceil(9.872)) // should round up
//
//
// // // Math.pow();
// console.log(Math.pow(4, 12)); //4^12
// console.log(Math.pow(9, 3));
//
// // // Math.sqrt();
// console.log(Math.sqrt(100));
//
//
// // // Math Constants **
//
// // Euler's Number
console.log(Math.E);

// // Pi
console.log(Math.floor(Math.PI));

// // Question: what's an example of a Math property and what's an example of a Math method?
// // What's the difference?


/** Mini Exercises **/
//
// // TODO: Write a function that returns a random team from the given array:
// var teams = ["76ers",
//     "Bucks" ,
//     "Bulls" ,
//     "Cavaliers" ,
//     "Celtics" ,
//     "Clippers" ,
//     "Grizzlies" ,
//     "Hawks" ,
//     "Heat" ,
//     "Hornets" ,
//     "Jazz" ,
//     "Kings" ,
//     "Knicks" ,
//     "Lakers" ,
//     "Magic" ,
//     "Mavericks" ,
//     "Nets" ,
//     "Nuggets" ,
//     "Pacers" ,
//     "Pelicans" ,
//     "Pistons" ,
//     "Raptors" ,
//     "Rockets" ,
//     "Spurs" ,
//     "Suns" ,
//     "Thunder" ,
//     "Timberwolves" ,
//     "Trail Blazers" ,
//     "Warriors" ,
//     "Wizards"]
// console.log(teams);
//
// // // solution:
// function getRandomTeam(arr) {
//
//     // get random index value
//     const randomIndex = Math.floor(Math.random() * arr.length);
//
//     // get random item
//     const item = arr[randomIndex];
//
//     return item;
// }
//
//
// const result = getRandomTeam(teams);
// console.log(result);
