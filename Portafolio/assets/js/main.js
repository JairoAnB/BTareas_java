const scrollToTopBtn = document.getElementById("scrollToTop");
window.onscroll = () => {
  if (
    document.body.scrollTop > 100 ||
    document.documentElement.scrollTop > 100
  ) {
    scrollToTopBtn.style.display = "block";
  } else {
    scrollToTopBtn.style.display = "none";
  }
};

scrollToTopBtn.addEventListener("click", () => {
  window.scrollTo({ top: 0, behavior: "smooth" });
});
const form = document.querySelector("form");
const emailInput = document.querySelector("#inputEmail");
const errorMsg = document.createElement("div");
errorMsg.classList.add("error-msg");
emailInput.parentElement.appendChild(errorMsg);

emailInput.addEventListener("input", () => {
  if (!emailInput.validity.valid) {
    errorMsg.textContent = "Por favor, ingresa un correo electrónico válido.";
    emailInput.classList.add("is-invalid");
  } else {
    errorMsg.textContent = "";
    emailInput.classList.remove("is-invalid");
  }
});

form.addEventListener("submit", (e) => {
  if (!emailInput.validity.valid) {
    e.preventDefault();
    errorMsg.textContent = "Por favor, corrige los errores antes de enviar.";
  }
  var alerta = (document.getElementById("alerta").style.display = "block");
});
