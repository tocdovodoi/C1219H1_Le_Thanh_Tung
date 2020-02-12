let userName = prompt("Nhập id");
if (userName == "admin") {
    let pass = prompt("Nhập password");
    if (pass == "TheMaster") {
        alert("Wellcome");
    } else if (pass == null) {
        alert("Canceled");
    } else {
        alert("Wrong Password");
    }
} else if (userName == null) {
    alert("Cancel!");
} else {
    alert("I don't know!")
}