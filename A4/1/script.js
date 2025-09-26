document.getElementById("regForm").addEventListener("submit", function(e){
  e.preventDefault();
  let name = document.getElementById("name").value.trim(),
      age = document.getElementById("age").value.trim(),
      course = document.getElementById("course").value.trim(),
      email = document.getElementById("email").value.trim();

  if(!name || !age || !course || !email){
    alert("All fields are required!");
    return;
  }

  let row = `<tr><td>${name}</td><td>${age}</td><td>${course}</td><td>${email}</td></tr>`;
  document.getElementById("studentTable").innerHTML += row;
  this.reset();
});
