// Atalen testuak bi hizkuntzetan / Section texts in both languages
const layoutTexts = {
  eu: {
    menu: "Menua", account: "Kontua", home: "Hasiera", events: "Ekintzak", join: "Izen ematea",
    about: "Guri buruz", contact: "Kontaktua", membership: "Bazkidetza", calendar: "Egutegia",
    content: "Edukiaren eremua", event_card: "Ekintzaren txartela", all_events: "Ikusi ekintza guztiak",
    weekend: "Asteburukoak", summer: "Udakoak", registration: "Izen-ematearen eremua",
    staff: "Langileak", staff_card: "Langilearen txartela", suggestion: "Iradokizuna",
    location: "Kokapena", profile: "Bazkidearen datuak", tutor: "Tutorea", login: "Saioa hasi",
    signup: "Eman izena", settings: "Ezarpenak", credit: "Kodekinek garatua",
    full_site: "Web osoa", without_css: "CSS gabe", with_css: "CSSrekin"
  },
  en: {
    menu: "Menu", account: "Account", home: "Home", events: "Events", join: "Join Event",
    about: "About us", contact: "Contact", membership: "Membership", calendar: "Calendar",
    content: "Content area", event_card: "Event card", all_events: "View all events",
    weekend: "Weekend activities", summer: "Summer activities", registration: "Registration area",
    staff: "Staff", staff_card: "Staff card", suggestion: "Suggestion",
    location: "Location", profile: "Member details", tutor: "Tutor", login: "Login",
    signup: "Sign up", settings: "Settings", credit: "Developed by Kodekin",
    full_site: "Full website", without_css: "Without CSS", with_css: "With CSS"
  }
};

// Webaren atalak eta menuaren botoia / Website sections and menu button
const layoutPanels = document.querySelectorAll("[data-panel]");
const layoutPages = Array.from(layoutPanels, panel => panel.dataset.panel);
const layoutMenuButton = document.querySelector("#layout-menu-btn");
const layoutSide = document.querySelector("#layout-side");

// Aukeratutako atala bakarrik erakusten da / Only show the selected section
function showLayoutPanel() {
  let page = location.hash.slice(1) || "home";
  if (!layoutPages.includes(page)) {
    page = "home";
  }
  for (const panel of layoutPanels) {
    panel.hidden = panel.dataset.panel !== page;
  }
  for (const link of document.querySelectorAll(".layout-side a")) {
    if (link.hash === "#" + page) {
      link.setAttribute("aria-current", "page");
    } else {
      link.removeAttribute("aria-current");
    }
  }
  window.scrollTo(0, 0);
}

// Testuen hizkuntza aldatzen da / Change the text language
function changeLayoutLanguage(language) {
  document.documentElement.lang = language;
  for (const item of document.querySelectorAll("[data-i18n]")) {
    item.textContent = layoutTexts[language][item.dataset.i18n];
  }
  for (const button of document.querySelectorAll("[data-lang]")) {
    button.setAttribute("aria-pressed", String(button.dataset.lang === language));
  }
  layoutMenuButton.setAttribute("aria-label", layoutTexts[language].menu);
}

// Botoiak menua ireki edo ixten du / The button opens or closes the menu
layoutMenuButton.addEventListener("click", function () {
  layoutSide.hidden = !layoutSide.hidden;
  layoutMenuButton.setAttribute("aria-expanded", String(!layoutSide.hidden));
});
// Hizkuntzaren botoiak / Language buttons
for (const button of document.querySelectorAll("[data-lang]")) {
  button.addEventListener("click", function () {
    changeLayoutLanguage(button.dataset.lang);
  });
}
// Esteka aldatzean dagokion atala erakusten da / Show the matching section when the link changes
window.addEventListener("hashchange", showLayoutPanel);
// Hasieran euskaraz erakusten da / Show Basque at the start
changeLayoutLanguage("eu");
showLayoutPanel();
