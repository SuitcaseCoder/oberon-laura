(function(){
    "use strict";

    var planets = [
        'Mercury',
        'Venus',
        'Earth',
        'Mars',
        'Jupiter',
        'Saturn',
        'Uranus',
        'Neptune'
    ];

    var arr = [];
    planets.forEach(function eachDay(day){
        console.log(`here's the day today: ${day}`);
        arr.push(day);
    })
    console.log(arr);

    /**
     * TODO:
     * Read each console log below, and write some javascript code to perform
     * the step that it describes
     */

    console.log('Adding "The Sun" to the beginning of the planets array.');
    console.log(planets);

    console.log('Adding "Pluto" to the end of the planets array.');
    console.log(planets);

    console.log('Removing "The Sun" from the beginning of the planets array.');
    console.log(planets);

    console.log('Removing "Pluto" from the end of the planets array.');
    console.log(planets);

    console.log('Finding and logging the index of "Earth" in the planets array.');

    console.log("Reversing the order of the planets array.");
    console.log(planets);

    console.log("Sorting the planets array.");
    console.log(planets);
})();