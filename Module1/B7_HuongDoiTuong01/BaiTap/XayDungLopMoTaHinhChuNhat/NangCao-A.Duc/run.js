function drawRectangle(recWidth, recHeight) {
    // let recWidth = parseFloat(document.getElementById("recWidth").value);
    // let recHeight = parseFloat(document.getElementById("recHeight").value);

    let result = document.getElementById("result");
    let rec = new Rectangle(recWidth, recHeight);
    rec.draw("myCanvas");
    result.innerText = rec.display();
}