let diemToan = parseInt(prompt("Nhập điểm Toán"));
let diemLy = parseInt(prompt("Nhập điểm Lý"));
let diemHoa = parseInt(prompt("Nhập điểm Hoá"));
let diemTb = (diemHoa + diemLy + diemToan) / 3;
document.write("Điểm Toán = " + diemToan + "<br>");
document.write("Điểm Lý = " + diemLy + "<br>");
document.write("Điểm Hoá = " + diemHoa + "<br>");
document.write("<p style='color: red '> Điểm trung bình của sinh viên bằng: " + diemTb + "</p>");