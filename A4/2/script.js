// Book constructor
function Book(title, author, price, stock) {
  this.title = title;
  this.author = author;
  this.price = price;
  this.stock = stock;
}

let books = [];

// Add book
function addBook() {
  const title = document.getElementById("title").value;
  const author = document.getElementById("author").value;
  const price = document.getElementById("price").value;
  const stock = document.getElementById("stock").value;

  if (title && author && price && stock) {
    books.push(new Book(title, author, price, stock));
    displayBooks();
    document.querySelectorAll("input").forEach(i => i.value = ""); // clear form
  }
}

// Display books
function displayBooks() {
  bookList.innerHTML = "";
  books.forEach(b => {
    bookList.innerHTML += `
      <tr>
        <td>${b.title}</td>
        <td>${b.author}</td>
        <td>₹${b.price}</td>
        <td>${b.stock}</td>
      </tr>`;
  });
}
