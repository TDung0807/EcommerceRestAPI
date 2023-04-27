// $(document).ready(() {
//     $('#hamburger-menu').click(() => {
//         $('#hamburger-menu').toggleClass('active');
//         $('#menu_item').toggleClass('active');
//     })
// })




// Changecolornav
window.addEventListener("scroll", function () {
  var navbar = document.querySelector(".navbar");
  if (window.pageYOffset > 50) {
    navbar.classList.add("navbar--scrolled");
    navbar.classList.remove("navbar--top");
  } else {
    navbar.classList.remove("navbar--scrolled");
    navbar.classList.add("navbar--top");
  }
});


// Dropdown

function closeDropdown() {
  document.getElementById("myDropdown").classList.remove("show");
}


function Dropdown() {
  document.getElementById("myDropdown").classList.add("show");
}


window.onmousemove = function (e) {
  if (!e.target.matches('.dropdown, .dropdown *')) {
    closeDropdown();
  }
}


const startWatchingBtn = document.getElementById("start-watching-btn");
const moviesSection = document.getElementById("movies1");


startWatchingBtn.addEventListener("click", () => {
  event.preventDefault();
  moviesSection.scrollIntoView({ behavior: "smooth" });
});


