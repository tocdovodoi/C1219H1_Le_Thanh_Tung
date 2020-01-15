var Rectangle = function (width, height) { //Thuộc tính
    this.width = width;
    this.height = height;
    this.getWidth = function () {
        return this.width;
    };
    this.getHeight = function () {
        return this.height;
    };
    this.getPerimeter = function () { // phương thức get chu vi
        return (this.width + this.height) * 2;
    };
    this.getArea = function () { // phương thức get diện tích
        return this.width * this.height;
    };
    this.draw = function (id) {
        let myCanvas = document.getElementById(id);
        let context = myCanvas.getContext("2d");
        context.fillStyle = "#FF0000";
        context.fillRect(0, 0, this.width, this.height);
    }
    this.display = function () {
        return "Dien tich " + this.getArea() + ", chu vi : " + this.getPerimeter();
    }
}
