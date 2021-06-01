// flipping cards

// ---- PASTA
function flipPasta() {
    console.log("clicked");
    //remove hide class on flipped card
    document.getElementById("pasta-flipped").setAttribute("class", " d-block");
    console.log(document.getElementById("pasta-flipped"));
    //add show class on flipped card
    // document.getElementById("pasta-flipped").setAttribute("class", "col-3 d-block");
    // remove show class on card
    document.getElementById("pasta").removeAttribute("class");
    //add hide class on card
    document.getElementById("pasta").setAttribute("class", "col-3 d-none");

};

function flipPastaBack(){
    console.log("clicked");
    //remove hide class on flipped card
    document.getElementById("pasta-flipped").removeAttribute("class");
    //add show class on flipped card
    document.getElementById("pasta-flipped").setAttribute("class", "col-3 d-none");
    // remove show class on card
    document.getElementById("pasta").removeAttribute("class");
    //add hide class on card
    document.getElementById("pasta").setAttribute("class", "col-3 d-block");
}


// ---- BED
function flipSleep() {
    console.log("clicked");
    //remove hide class on flipped card
    document.getElementById("bed-flipped").removeAttribute("class");
    //add show class on flipped card
    document.getElementById("bed-flipped").setAttribute("class", "col-3" +
        " d-block");
    // remove show class on card
    document.getElementById("bed").removeAttribute("class");
    //add hide class on card
    document.getElementById("bed").setAttribute("class", "col-3 d-none");

};

function flipSleepBack(){
    console.log("clicked");
    //remove hide class on flipped card
    document.getElementById("bed-flipped").removeAttribute("class");
    //add show class on flipped card
    document.getElementById("bed-flipped").setAttribute("class", "col-3" +
        " d-none");
    // remove show class on card
    document.getElementById("bed").removeAttribute("class");
    //add hide class on card
    document.getElementById("bed").setAttribute("class", "col-3 d-block");
}

// ---- FAST
function flipFast() {
    console.log("clicked");
    //remove hide class on flipped card
    document.getElementById("fast-flipped").removeAttribute("class");
    //add show class on flipped card
    document.getElementById("fast-flipped").setAttribute("class", "col-3" +
        " d-block");
    // remove show class on card
    document.getElementById("fast").removeAttribute("class");
    //add hide class on card
    document.getElementById("fast").setAttribute("class", "col-3 d-none");

};

function flipFastBack(){
    console.log("clicked");
    //remove hide class on flipped card
    document.getElementById("fast-flipped").removeAttribute("class");
    //add show class on flipped card
    document.getElementById("fast-flipped").setAttribute("class", "col-3" +
        " d-none");
    // remove show class on card
    document.getElementById("fast").removeAttribute("class");
    //add hide class on card
    document.getElementById("fast").setAttribute("class", "col-3 d-block");
}



// pasta
document.getElementById("pasta").addEventListener("click", flipPasta);
document.getElementById("pasta-flipped").addEventListener("click", flipPastaBack);

// bed
document.getElementById("bed").addEventListener("click", flipSleep);
document.getElementById("bed-flipped").addEventListener("click", flipSleepBack);

// fast
document.getElementById("fast").addEventListener("click", flipFast);
document.getElementById("fast-flipped").addEventListener("click", flipFastBack);

