// Webaren botoiak eta formularioak hemen kontrolatzen dira / The website buttons and forms are handled here

// Euskarazko eta ingelesezko testuak / Basque and English texts
// Izen hauek HTMLko data-i18n balioekin lotzen dira / These names match the data-i18n values in the HTML
const texts = {
  en: {
    menu: "Menu", login: "Login", signup: "Sign up", logout: "Logout", settings: "Settings",
    account: "Account", close: "Close", credits: "Authors", developed_by: "Developed by Kodekin",
    photo_credits: "Photos · Pexels", photo_portrait: "Portrait",
    nav_home: "Home", nav_events: "Events", nav_join: "Join Event", nav_about: "About us",
    nav_contact: "Contact", nav_membership: "Membership",
    calendar: "Calendar", recent_events: "Recent events", view_all_events: "View all events",
    months: ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"],
    weekdays: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"],
    weekdays_short: ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"],
    weekend_events: "Weekend activities", summer_events: "Summer activities",
    daytime_events: "Daytime activities", night_events: "Night activities",
    event_type: "Event type", talk: "Talks", concert: "Concerts", game: "Games", trip: "Trips",
    surf_intro: "Introduction to surfing", paddle_surf: "Paddle surfing", mountain_trip: "Mountain trips", night_activity: "Night activity",
    speaker: "Speaker", performer: "Artist", staff: "Staff", monitor: "Activity leader", administration: "Administration",
    sample_activities: "Example activities with fictional dates and participants.",
    festival_photo: "Crowd at an outdoor festival", workshop_photo: "Students working together on laptops",
    concert_photo: "Crowd at an evening concert", games_photo: "Outdoor group games",
    mountain_photo: "Hikers in the mountains", surf_photo: "Surfers riding waves", paddle_photo: "Paddleboard on a lake",
    trip_photo: "Guggenheim Museum in Bilbao", dinner_photo: "Group sharing a meal",
    choose_payment: "Choose a payment method", payment_cash: "Cash", payment_card: "Card",
    join_payment_required: "Choose a payment method.", join_confirmed: "Test registration confirmed.",
    price: "Price", payment: "Payment", suggestion: "Suggestion", contact_info: "Contact",
    title_label: "Title", message_label: "Message", send: "Send", email: "Email", phone: "Phone",
    location: "Location",
    membership_login: "Log in to see your membership details.", member_details: "Member details",
    no_tutor: "No tutor is registered for this account.", tutor_id: "Tutor ID",
    login_title: "Login", fake_login: "Fake log", password: "Password", no_account: "No account yet?", create_account: "Create one",
    signup_title: "Sign up", name: "Name", surname: "Surname", birth: "Birth date",
    repeat_password: "Repeat password", terms: "I accept the terms and privacy policy",
    have_account: "Already have an account?", settings_title: "Settings", profile: "Profile",
    save: "Save", change_password: "Change password", current_password: "Current password",
    new_password: "New password", preferences: "Preferences", language: "Language", basque: "Basque", english: "English",
    notify: "Email me about new events",
    home_intro: "Discover activities for young people in Ermua.",
    about_team: "Example team profiles with fictional names and illustrative stock photos.",
    date: "Date", where: "Where", non_member_price: "Non-member", member_price: "Member", join_in: "Join in",
    schedule: "Time", places: "Places",
    id_number: "ID", country: "Country", address: "Address", postal_code: "Postal code", tutor: "Tutor", cancel: "Cancel",
    required_fields: "Please fill in all required fields.",
    account_not_found: "No account found with that email.", wrong_login: "Wrong email or password.",
    passwords_mismatch: "The passwords do not match.", minimum_age: "You must be at least 12 years old to sign up.",
    tutor_needed: "Users under 18 need a tutor. Please fill in the tutor form.",
    existing_account: "An account with this email already exists.", tutor_age: "A tutor must be 18 or older.",
    profile_required: "Please fill in your first and last names.", saved: "Saved.",
    wrong_current_password: "Your current password is wrong.", password_changed: "Password changed.",
    suggestion_required: "Please add a title and a message.", suggestion_ready: "Thanks, your suggestion is ready to be sent."
  },
  eu: {
    menu: "Menua", login: "Saioa hasi", signup: "Eman izena", logout: "Saioa itxi", settings: "Ezarpenak",
    account: "Kontua", close: "Itxi", credits: "Egileak", developed_by: "Kodekinek garatua",
    photo_credits: "Argazkiak · Pexels", photo_portrait: "Erretratua",
    nav_home: "Hasiera", nav_events: "Ekintzak", nav_join: "Izen ematea", nav_about: "Guri buruz",
    nav_contact: "Kontaktua", nav_membership: "Bazkidetza",
    calendar: "Egutegia", recent_events: "Azken ekintzak", view_all_events: "Ikusi ekintza guztiak",
    months: ["urtarrila", "otsaila", "martxoa", "apirila", "maiatza", "ekaina", "uztaila", "abuztua", "iraila", "urria", "azaroa", "abendua"],
    weekdays: ["astelehena", "asteartea", "asteazkena", "osteguna", "ostirala", "larunbata", "igandea"],
    weekdays_short: ["Al", "Ar", "Az", "Og", "Or", "Lr", "Ig"],
    weekend_events: "Asteburukoak", summer_events: "Udakoak",
    daytime_events: "Egunekoak", night_events: "Gauekoak",
    event_type: "Ekintza mota", talk: "Hitzaldiak", concert: "Kontzertuak", game: "Jolasak", trip: "Irteerak",
    surf_intro: "Surf hastapena", paddle_surf: "Paddle surf", mountain_trip: "Mendi irteerak", night_activity: "Gaueko ekintza",
    speaker: "Hizlaria", performer: "Artista", staff: "Langileak", monitor: "Monitorea", administration: "Administrazioa",
    sample_activities: "Adibidezko ekintzak, fikziozko datekin eta parte-hartzaileekin.",
    festival_photo: "Jendea aire zabaleko jaialdi batean", workshop_photo: "Ikasleak ordenagailu eramangarriekin lanean",
    concert_photo: "Jendea gaueko kontzertu batean", games_photo: "Talde-jolasak aire zabalean",
    mountain_photo: "Mendizaleak mendian", surf_photo: "Surflariak olatuetan", paddle_photo: "Paddle surf taula lakuan",
    trip_photo: "Bilboko Guggenheim museoa", dinner_photo: "Taldea elkarrekin afaltzen",
    choose_payment: "Aukeratu ordainketa-modua", payment_cash: "Eskudirutan", payment_card: "Txartelarekin",
    join_payment_required: "Aukeratu ordainketa-modua.", join_confirmed: "Probako izen-ematea baieztatu da.",
    price: "Prezioa", payment: "Ordainketa", suggestion: "Iradokizuna", contact_info: "Kontaktua",
    title_label: "Izenburua", message_label: "Mezua", send: "Bidali", email: "Posta elektronikoa", phone: "Telefonoa",
    location: "Kokapena",
    membership_login: "Hasi saioa bazkidetza-datuak ikusteko.", member_details: "Bazkidearen datuak",
    no_tutor: "Kontu honek ez du tutorerik erregistratuta.", tutor_id: "tutoreaID",
    login_title: "Saioa hasi", fake_login: "Probako saioa", password: "Pasahitza", no_account: "Oraindik ez duzu konturik?", create_account: "Sortu bat",
    signup_title: "Eman izena", name: "Izena", surname: "Abizenak", birth: "Jaiotza-data",
    repeat_password: "Errepikatu pasahitza", terms: "Baldintzak eta pribatutasun politika onartzen ditut",
    have_account: "Badaukazu kontua?", settings_title: "Ezarpenak", profile: "Profila",
    save: "Gorde", change_password: "Aldatu pasahitza", current_password: "Uneko pasahitza",
    new_password: "Pasahitz berria", preferences: "Hobespenak", language: "Hizkuntza", basque: "Euskara", english: "Ingelesa",
    notify: "Posta bidali ekitaldi berriei buruz",
    home_intro: "Ezagutu Ermuko gazteentzako ekintzak.",
    about_team: "Taldearen adibidezko profilak, fikziozko izenekin eta ilustrazio gisa erabilitako argazkiekin.",
    date: "Data", where: "Non", non_member_price: "Ez-bazkidea", member_price: "Bazkidea", join_in: "Eman izena",
    schedule: "Ordutegia", places: "Plaza kopurua",
    id_number: "NAN", country: "Herrialdea", address: "Helbidea", postal_code: "Posta kodea", tutor: "Tutorea", cancel: "Utzi",
    required_fields: "Bete nahitaezko eremu guztiak.",
    account_not_found: "Ez da helbide elektroniko horri lotutako konturik aurkitu.", wrong_login: "Helbide elektronikoa edo pasahitza okerra da.",
    passwords_mismatch: "Pasahitzak ez datoz bat.", minimum_age: "Izena emateko, gutxienez 12 urte izan behar dituzu.",
    tutor_needed: "18 urtetik beherakoek tutorea behar dute. Bete tutorearen formularioa.",
    existing_account: "Helbide elektroniko horrekin kontu bat badago lehendik.", tutor_age: "Tutoreak gutxienez 18 urte izan behar ditu.",
    profile_required: "Bete izena eta abizenak.", saved: "Gordeta.",
    wrong_current_password: "Uneko pasahitza okerra da.", password_changed: "Pasahitza aldatu da.",
    suggestion_required: "Idatzi izenburua eta mezua.", suggestion_ready: "Eskerrik asko. Zure iradokizuna bidaltzeko prest dago."
  }
};

// Behar ditugun datuak / Data we need
const sampleEvents = eventCatalog;
// Webaren atalak eta aukeratutako hizkuntza / Website sections and selected language
const pages = ["home", "events", "join", "about", "contact", "membership", "login", "signup", "settings"];
let language = localStorage.getItem("language") === "eu" ? "eu" : "en";
const smallScreen = window.matchMedia("(max-width: 900px)");
const side = document.querySelector("#side");
const menuButton = document.querySelector("#menu-btn");
const accountMenu = document.querySelector("#account-menu");
const joinForm = document.querySelector("#join-form");

// Tutorearen datuak izen-ematea amaitu arte gordetzen dira / Keep tutor details until sign-up is finished
let pendingTutor = null;

// Hainbat lekutan erabiltzen diren funtzioak / Functions used in several places
// Kode bera berriro erabiltzeko funtzioak / Functions to reuse the same code

// Testua aukeratutako hizkuntzan hartzen da / Get the text in the selected language
function t(key) {
  return texts[language][key];
}

// Gordetako erabiltzaileak irakurtzen dira / Read the saved users
function getUsers() {
  return JSON.parse(localStorage.getItem("users")) || {};
}

function saveUsers(users) {
  localStorage.setItem("users", JSON.stringify(users));
}

// Saioa hasita duen erabiltzailea bilatzen da / Find the logged-in user
function getCurrentUser() {
  const fakeUser = sessionStorage.getItem("fakeUser");
  if (fakeUser !== null) {
    return JSON.parse(fakeUser);
  }

  const email = localStorage.getItem("loggedIn");
  if (email === null) {
    return null;
  }
  return getUsers()[email];
}

function saveCurrentUser(user) {
  if (sessionStorage.getItem("fakeUser") !== null) {
    sessionStorage.setItem("fakeUser", JSON.stringify(user));
  } else {
    const users = getUsers();
    users[user.email] = user;
    saveUsers(users);
  }
}

// Mezua formularioaren azpian erakusten da / Show a message below the form
function showMessage(id, key, isError) {
  const element = document.querySelector("#" + id);
  if (key) {
    element.dataset.i18n = key;
    element.textContent = t(key);
  } else {
    delete element.dataset.i18n;
    element.textContent = "";
  }
  element.classList.toggle("error", !!isError);
}

// Derrigorrezko eremuak beteta dauden begiratzen da / Check that required fields are filled in
function allFilled(form) {
  const fields = form.querySelectorAll("[required]");
  for (let i = 0; i < fields.length; i++) {
    if (fields[i].type === "checkbox") {
      if (!fields[i].checked) {
        return false;
      }
    } else if (fields[i].value.trim() === "") {
      return false;
    }
  }
  return true;
}

// Pantailan ikusten dena aldatzeko funtzioak / Functions to change what appears on screen

// Webaren hizkuntza aldatzen da / Change the website language
function updateLanguage() {
  document.documentElement.lang = language;
  menuButton.setAttribute("aria-label", t("menu"));
  document.querySelector(".logo").setAttribute("aria-label", "Gazteleku · " + t("nav_home"));
  document.querySelector("#account-btn").setAttribute("aria-label", t("account"));
  document.querySelector("#account-close").setAttribute("aria-label", t("close"));

  // data-i18n duten testuak aldatzen dira / Change texts with data-i18n
  const items = document.querySelectorAll("[data-i18n]");
  for (let i = 0; i < items.length; i++) {
    items[i].textContent = t(items[i].dataset.i18n);
  }

  // Aukeratutako hizkuntzaren botoia markatzen da / Highlight the selected language button
  const buttons = document.querySelectorAll("[data-lang]");
  for (let i = 0; i < buttons.length; i++) {
    const active = buttons[i].dataset.lang === language;
    buttons[i].classList.toggle("active", active);
    buttons[i].setAttribute("aria-pressed", String(active));
  }

  document.querySelector("#pref-lang").value = language;
  showCalendar();
  showEvents();
  showCoordinators();
  showPhotoCredits();
  fillJoinEvents();
  updateJoinDetails();
  if (document.querySelector('[data-view="membership"]').classList.contains("active")) {
    fillMembership(getCurrentUser());
  }
}

function changeLanguage(newLanguage) {
  language = newLanguage === "eu" ? "eu" : "en";
  localStorage.setItem("language", language);
  updateLanguage();
}

// Kontuaren ikonoa eta menua / Account icon and menu
// Kontuaren aukerak saioaren arabera erakusten dira / Show account options depending on the login
function updateTopBar() {
  const user = getCurrentUser();
  const avatar = document.querySelector("#avatar");
  document.querySelector("#menu-guest").hidden = !!user;
  document.querySelector("#menu-user").hidden = !user;
  avatar.textContent = user ? user.name.charAt(0) : "";
  avatar.hidden = !user;
  document.querySelector("#avatar-icon").toggleAttribute("hidden", !!user);
}

function closeAccountMenu() {
  accountMenu.close();
}

function setMenuOpen(open) {
  if (!open && side.contains(document.activeElement)) {
    menuButton.focus();
  }
  side.hidden = !open;
  menuButton.setAttribute("aria-expanded", String(open));
}

// Adina / Age
// Jaiotze-datatik adina kalkulatzen da / Calculate the age from the birth date
function ageFrom(birthText) {
  const parts = birthText.split("-");
  const birthYear = Number(parts[0]);
  const birthMonth = Number(parts[1]);
  const birthDay = Number(parts[2]);
  const today = new Date();
  const thisMonth = today.getMonth() + 1;

  let age = today.getFullYear() - birthYear;
  // Aurten urtebetetzea ez bada pasa, urte bat kentzen da / Subtract one year if the birthday has not passed yet
  if (thisMonth < birthMonth || (thisMonth === birthMonth && today.getDate() < birthDay)) {
    age = age - 1;
  }
  return age;
}

// Egutegia, ekintzak eta koordinatzaileak / Calendar, activities and coordinators
function showCalendar() {
  const today = new Date();
  const year = today.getFullYear();
  const month = today.getMonth();
  const firstDay = new Date(year, month, 1);
  // Astelehena lehenengo zutabean jartzen da / Put Monday in the first column
  const emptyDays = (firstDay.getDay() + 6) % 7;
  const daysInMonth = new Date(year, month + 1, 0).getDate();
  const table = document.querySelector("#calendar-table");

  table.caption.textContent = t("months")[month] + " " + year;
  const headings = table.tHead.rows[0].cells;
  for (let i = 0; i < headings.length; i++) {
    headings[i].textContent = t("weekdays_short")[i];
    headings[i].setAttribute("aria-label", t("weekdays")[i]);
  }

  const body = table.tBodies[0];
  body.replaceChildren();
  for (let first = 1 - emptyDays; first <= daysInMonth; first += 7) {
    const week = body.insertRow();
    for (let day = first; day < first + 7; day++) {
      const cell = week.insertCell();
      if (day >= 1 && day <= daysInMonth) {
        cell.textContent = day;
        if (day === today.getDate()) {
          cell.setAttribute("aria-current", "date");
        }
      }
    }
  }
}

// Antzeko ekintzek argazki bera erabiltzen dute / Similar activities use the same photo
const eventPhotos = {
  talk: { photoId: 8457292, photoSlug: "students-studying-together", photographer: "Norma Mortenson", imageAlt: "workshop_photo" },
  concert: { photoId: 5156595, photoSlug: "people-gathering-at-a-concert", photographer: "Maor Attias", imageAlt: "concert_photo" },
  game: { photoId: 8457809, photoSlug: "a-group-of-kids-holding-on-a-playground-equipment-near-buildings", photographer: "Norma Mortenson", imageAlt: "games_photo" },
  trip: { photoId: 3830433, photoSlug: "guggenheim-museum-bilbao", photographer: "Mark Neal", imageAlt: "trip_photo" },
  surf_intro: { photoId: 4603230, photoSlug: "people-surfing-on-sea-waves", photographer: "Jess Loiterton", imageAlt: "surf_photo" },
  paddle_surf: { photoId: 6936597, photoSlug: "a-man-riding-on-a-paddleboard-floating-on-the-lake", photographer: "Pexels", imageAlt: "paddle_photo" },
  mountain_trip: { photoId: 1674120, photoSlug: "group-of-people-at-the-top-of-the-mountain", photographer: "Artem Mizyuk", imageAlt: "mountain_photo" },
  youth_dinner: { photoId: 5881724, photoSlug: "man-and-women-eating-at-table", photographer: "olia danilevich", imageAlt: "dinner_photo" },
  halloween: { photoId: 13051942, photoSlug: "people-gathering-in-a-crowd", photographer: "Quyn Phạm", imageAlt: "festival_photo" }
};


function formatPrice(price) {
  const amount = price.toFixed(2);
  return language === "eu" ? amount.replace(".", ",") + " €" : "€" + amount;
}

function formatMemberPrice(price) {
  return formatPrice(price * 0.75);
}

function formatDate(date) {
  const [year, month, day] = date.split("-");
  return language === "eu" ? year + "/" + month + "/" + day : Number(day) + " " + t("months")[Number(month) - 1] + " " + year;
}

function eventDetails(event) {
  let dates = formatDate(event.date);
  if (event.endDate !== event.date) {
    dates += " – " + formatDate(event.endDate);
  }
  return `
    <dt>${t("date")}:</dt><dd>${dates}</dd>
    <dt>${t("schedule")}:</dt><dd>${event.startTime} – ${event.endTime}</dd>
    <dt>${t("places")}:</dt><dd>${event.capacity}</dd>
    <dt>${t("where")}:</dt><dd>${event.location[language]}</dd>`;
}

function showEvents() {
  const boxes = document.querySelectorAll("[data-events]");
  const joinLink = getCurrentUser() ? "#join" : "#login";

  for (let i = 0; i < boxes.length; i++) {
    const group = boxes[i].dataset.events;
    let cards = "";

    // Ekintza bakoitzeko txartel bat sortzen da / Create one card for each activity
    for (let n = 0; n < sampleEvents.length; n++) {
      const ev = sampleEvents[n];
      if ((group === "next" && !ev.featured) || (group !== "next" && ev.type !== group)) {
        continue;
      }
      const photo = eventPhotos[ev.photo];
      const personDetails = eventPersonDetails(ev);
      cards += `
        <article class="card" data-event-code="${ev.code}">
          <div class="name">${ev.name[language]}</div>
          <p class="event-kind">${ev.code} · ${t(ev.type)}</p>
          <div class="img"><img src="images/pexels/pexels-${photo.photoId}.jpg" alt="${t(photo.imageAlt)}" loading="lazy"></div>
          <p class="event-description">${ev.description[language]}</p>
          <dl>
            ${eventDetails(ev)}
            ${personDetails ? `<dt>${personDetails.label}:</dt><dd>${personDetails.name}</dd>` : ""}
            <dt>${t("non_member_price")}:</dt><dd>${formatPrice(ev.price)}</dd>
            <dt>${t("member_price")}:</dt><dd>${formatMemberPrice(ev.price)}</dd>
          </dl>
          <div class="foot">
            <a class="btn accent" href="${joinLink}" data-join-event="${ev.code}">${t("join_in")}</a>
          </div>
        </article>`;
    }
    boxes[i].innerHTML = cards;
  }
}

function eventPersonDetails(event) {
  if (event.speaker) {
    return { label: t("speaker"), name: event.speaker };
  }
  if (event.performer) {
    return { label: t("performer"), name: event.performer };
  }
  return null;
}

function fillJoinEvents() {
  const select = joinForm.elements.eventChoice;
  const selectedCode = select.value;
  select.replaceChildren();
  for (let i = 0; i < sampleEvents.length; i++) {
    const event = sampleEvents[i];
    const option = document.createElement("option");
    option.value = event.code;
    option.textContent = event.code + " · " + event.name[language];
    select.append(option);
  }
  if (sampleEvents.some(event => event.code === selectedCode)) {
    select.value = selectedCode;
  }
}

function updateJoinDetails() {
  const fields = joinForm.elements;
  const selectedEvent = sampleEvents.find(event => event.code === fields.eventChoice.value);
  fields.eventType.value = t(selectedEvent.type);
  fields.price.value = formatPrice(selectedEvent.price);
  fields.memberPrice.value = formatMemberPrice(selectedEvent.price);
  const person = eventPersonDetails(selectedEvent);
  const details = document.querySelector("#join-person");
  details.hidden = !person;
  details.textContent = person ? person.label + " · " + person.name : "";
  document.querySelector("#join-details").innerHTML = eventDetails(selectedEvent);
  document.querySelector("#join-description").textContent = selectedEvent.description[language];
}

// Asmatutako taldekideak eta adibideko argazkiak / Fictional team members and sample photos
const coordinators = [
  { name: "Ane Agirre", role: "monitor", photoId: 8463168, photoSlug: "portrait-of-smiling-woman-in-an-office", photographer: "Kampus Production" },
  { name: "Iker Aranburu", role: "monitor", photoId: 12311528, photoSlug: "portrait-of-smiling-man", photographer: "Joseph Eulo" },
  { name: "Maialen Etxeberria", role: "monitor", photoId: 30781747, photoSlug: "friendly-professional-woman-smiling-in-office", photographer: "Luan Albarracin" },
  { name: "Oier Elizalde", role: "monitor", photoId: 5871970, photoSlug: "close-up-shot-of-a-handsome-man-smiling", photographer: "logan hansen" },
  { name: "Nahia Aizpurua", role: "monitor", photoId: 3860641, photoSlug: "smiling-woman-working-in-office-with-coworkers", photographer: "Andrea Piacquadio" },
  { name: "Unai Larrañaga", role: "monitor", photoId: 30535637, photoSlug: "portrait-of-a-smiling-man-indoors", photographer: "Vitaly Gariev" },
  { name: "June Garmendia", role: "monitor", photoId: 27086242, photoSlug: "professional-woman-smiling-in-modern-office-setting", photographer: "Helena Lopes" },
  { name: "Eneko Zubizarreta", role: "monitor", photoId: 28426642, photoSlug: "professional-man-smiling-in-modern-office-environment", photographer: "Filip Rankovic Grobgaard" },
  { name: "Leire Mendizabal", role: "monitor", photoId: 8101326, photoSlug: "a-woman-smiling-sitting-in-the-office", photographer: "Mikhail Nilov" },
  { name: "Mikel Zabaleta", role: "administration", photoId: 13820231, photoSlug: "a-portrait-of-a-man-in-a-corporate-attire", photographer: "Rene Terp" },
  { name: "Irati Otxoa", role: "administration", photoId: 23496660, photoSlug: "portrait-of-a-young-woman-in-an-office", photographer: "Vitaly Gariev" },
  { name: "Aitor Goikoetxea", role: "administration", photoId: 36713035, photoSlug: "smiling-man-in-modern-office-interior", photographer: "Vitaly Gariev" }
];

function showCoordinators() {
  const box = document.querySelector("#coordinators");
  box.innerHTML = "";

  // Koordinatzaile bakoitzeko txartel bat sortzen da / Create one card for each coordinator
  for (let i = 0; i < coordinators.length; i++) {
    const person = coordinators[i];
    box.innerHTML += `
      <div class="tile">
        <div class="img"><img src="images/pexels/pexels-${person.photoId}.jpg" alt="" loading="lazy"></div>
        <h3>${person.name}</h3>
        <p class="staff-role">${t(person.role)}</p>
      </div>`;
  }
}

function photoCredit(photo, label) {
  return `<li><a href="https://www.pexels.com/photo/${photo.photoSlug}-${photo.photoId}/">${label} · ${photo.photographer}</a></li>`;
}

function showPhotoCredits() {
  const eventCredits = Object.values(eventPhotos).map(photo => photoCredit(photo, t(photo.imageAlt)));
  const portraitCredits = coordinators.map((person, index) => photoCredit(person, t("photo_portrait") + " " + (index + 1)));
  document.querySelector("#photo-credits-list").innerHTML = eventCredits.concat(portraitCredits).join("");
}

// Webaren atalak / Website sections
function fillDetails(listId, person) {
  const values = document.querySelectorAll("#" + listId + " [data-field]");
  for (let i = 0; i < values.length; i++) {
    const field = values[i].dataset.field;
    const value = person ? person[field] : "";
    values[i].textContent = value && field === "birth" ? formatDate(value) : value || "—";
  }
}

function fillMembership(user) {
  const tutor = user ? user.tutor : null;
  document.querySelector("#membership-guest").hidden = !!user;
  document.querySelector("#membership-details").hidden = !user;
  document.querySelector("#tutor-data").hidden = !tutor;
  document.querySelector("#no-tutor").hidden = !!tutor;

  // Tutoreari ID bat gehitzen zaio, falta bada / Add a tutor ID if it is missing
  if (tutor && !tutor.tutorId) {
    tutor.tutorId = crypto.randomUUID();
    saveCurrentUser(user);
  }

  fillDetails("member-data", user);
  fillDetails("tutor-data", tutor);
}

function showPage() {
  let page = location.hash.slice(1);
  if (page === "") {
    page = "home";
  }
  if (!pages.includes(page)) {
    page = "home";
  }

  const user = getCurrentUser();

  // Ezarpenetara sartzeko saioa hasi behar da / Log in to open settings
  if (page === "settings" && !user) {
    location.hash = "#login";
    return;
  }
  // Saioa hasita badago, hasierara joaten da / Go home if already logged in
  if ((page === "login" || page === "signup") && user) {
    location.hash = "#home";
    return;
  }

  // Aukeratutako atala erakusten da / Show the selected section
  const views = document.querySelectorAll(".view");
  for (let i = 0; i < views.length; i++) {
    if (views[i].dataset.view === page) {
      views[i].classList.add("active");
    } else {
      views[i].classList.remove("active");
    }
  }

  // Menuan aukeratutako esteka markatzen da / Highlight the selected menu link
  const links = document.querySelectorAll(".menu a");
  for (let i = 0; i < links.length; i++) {
    if (links[i].getAttribute("href") === "#" + page) {
      links[i].classList.add("active");
      links[i].setAttribute("aria-current", "page");
    } else {
      links[i].classList.remove("active");
      links[i].removeAttribute("aria-current");
    }
  }

  if (page === "settings") {
    fillSettings();
  }
  if (page === "membership") {
    fillMembership(user);
  }
  if (page === "join") {
    showMessage("join-status", "");
  }

  // Menuak itxi eta orriaren hasierara joaten da / Close the menus and go to the top of the page
  if (smallScreen.matches) {
    setMenuOpen(false);
  }
  closeAccountMenu();
  window.scrollTo(0, 0);
}

// Formularioak / Forms
// Formularioa bidaltzean orria ez da berriz kargatzen / Sending the form does not reload the page
// Formularioaren datuak hemen kudeatzen dira / Handle the form data here

function joinEvent(event) {
  event.preventDefault();
  if (!allFilled(event.target)) {
    showMessage("join-status", "join_payment_required", true);
    return;
  }
  if (!getCurrentUser()) {
    location.hash = "#login";
    return;
  }
  showMessage("join-status", "join_confirmed");
}

// Gordetako datuekin ezarpenen formularioa betetzen da / Fill the settings form with saved details
function fillSettings() {
  const user = getCurrentUser();
  const form = document.querySelector("#profile-form").elements;

  document.querySelector("#password-form").hidden = user.password === undefined;
  form.name.value = user.name;
  form.surname.value = user.surname;
  form.email.value = user.email;
  form.phone.value = user.phone;
  document.querySelector("#pref-notify").checked = user.notify;
}

function login(event) {
  event.preventDefault();
  const form = event.target.elements;

  if (!allFilled(event.target)) {
    showMessage("login-status", "required_fields", true);
    return;
  }

  const email = form.email.value.trim().toLowerCase();
  const user = getUsers()[email];

  if (!user) {
    showMessage("login-status", "account_not_found", true);
    return;
  }
  if (user.password !== form.password.value) {
    showMessage("login-status", "wrong_login", true);
    return;
  }

  localStorage.setItem("loggedIn", email);
  event.target.reset();
  showMessage("login-status", "");
  updateTopBar();
  changeLanguage(user.language);
  location.hash = "#home";
}

function fakeLogin() {
  // Probako profila fitxa honetan gordetzen da / Save the demo profile in this tab
  const fakeUser = {
    idNumber: "DEMO-001",
    name: "Ane",
    surname: "Adibide",
    birth: "2010-05-03",
    phone: "000 000 001",
    address: "Adibide kalea 1",
    country: "ES",
    postalCode: "00000",
    email: "demo@example.com",
    language: language,
    notify: false,
    tutor: {
      idNumber: "DEMO-002",
      name: "Mikel",
      surname: "Adibide",
      birth: "1985-05-03",
      phone: "000 000 002",
      address: "Adibide kalea 1",
      country: "ES",
      postalCode: "00000",
      email: "tutor@example.com"
    }
  };
  sessionStorage.setItem("fakeUser", JSON.stringify(fakeUser));
  document.querySelector("#login-form").reset();
  showMessage("login-status", "");
  updateTopBar();
  showEvents();
  location.hash = "#home";
}

function signup(event) {
  event.preventDefault();
  const form = event.target.elements;

  if (!allFilled(event.target)) {
    showMessage("signup-status", "required_fields", true);
    return;
  }
  if (form.password.value !== form.password2.value) {
    showMessage("signup-status", "passwords_mismatch", true);
    return;
  }

  // Gutxienez 12 urte; 18 urtetik behera tutorea behar da / Minimum age is 12; under 18 needs a tutor
  const age = ageFrom(form.birth.value);
  if (age < 12) {
    showMessage("signup-status", "minimum_age", true);
    return;
  }
  if (age < 18 && pendingTutor === null) {
    openTutorPopup();
    showMessage("signup-status", "tutor_needed", true);
    return;
  }

  const email = form.email.value.trim().toLowerCase();
  const users = getUsers();

  if (users[email]) {
    showMessage("signup-status", "existing_account", true);
    return;
  }

  users[email] = {
    name: form.name.value.trim(),
    surname: form.surname.value.trim(),
    birth: form.birth.value,
    idNumber: form.idNumber.value.trim(),
    phone: form.phone.value.trim(),
    country: form.country.value.trim(),
    address: form.address.value.trim(),
    postalCode: form.postal.value.trim(),
    email: email,
    password: form.password.value,
    language: language,
    notify: false,
    tutor: age < 18 ? pendingTutor : null
  };
  saveUsers(users);
  pendingTutor = null;

  localStorage.setItem("loggedIn", email);
  event.target.reset();
  showMessage("signup-status", "");
  updateTopBar();
  showEvents();
  location.hash = "#home";
}

// Tutorearen leihoa ireki eta ixteko / Open and close the tutor window
function openTutorPopup() {
  document.querySelector("#tutor-popup").hidden = false;
}

function closeTutorPopup() {
  document.querySelector("#tutor-popup").hidden = true;
}

// Adina begiratu eta tutorea eskatu behar bada / Check the age and ask for a tutor if needed
function checkBirthDate() {
  const birth = document.querySelector("#birth").value;
  if (birth === "") {
    return;
  }
  const age = ageFrom(birth);
  if (age < 12) {
    showMessage("signup-status", "minimum_age", true);
  } else if (age < 18 && pendingTutor === null) {
    openTutorPopup();
  }
}

// Tutorearen datuak gorde eta izen-ematea amaitzen da / Save tutor details and finish sign-up
function saveTutor(event) {
  event.preventDefault();
  const form = event.target.elements;

  if (!allFilled(event.target)) {
    showMessage("tutor-status", "required_fields", true);
    return;
  }
  if (ageFrom(form.birth.value) < 18) {
    showMessage("tutor-status", "tutor_age", true);
    return;
  }

  pendingTutor = {
    name: form.name.value.trim(),
    surname: form.surname.value.trim(),
    birth: form.birth.value,
    idNumber: form.idNumber.value.trim(),
    phone: form.phone.value.trim(),
    country: form.country.value.trim(),
    address: form.address.value.trim(),
    postalCode: form.postal.value.trim(),
    email: form.email.value.trim().toLowerCase()
  };
  event.target.reset();
  showMessage("tutor-status", "");
  closeTutorPopup();

  // Tutorea gordeta, izen-ematea berriz bidaltzen da / Send the sign-up form again after saving the tutor
  document.querySelector("#signup-form").requestSubmit();
}

function logout() {
  sessionStorage.removeItem("fakeUser");
  localStorage.removeItem("loggedIn");
  fillMembership(null);
  updateTopBar();
  closeAccountMenu();
  showEvents();
  location.hash = "#home";
}

function saveProfile(event) {
  event.preventDefault();
  const form = event.target.elements;
  const user = getCurrentUser();
  if (!user) {
    return;
  }

  if (!allFilled(event.target)) {
    showMessage("profile-status", "profile_required", true);
    return;
  }

  user.name = form.name.value.trim();
  user.surname = form.surname.value.trim();
  user.phone = form.phone.value.trim();
  saveCurrentUser(user);

  updateTopBar();
  showMessage("profile-status", "saved");
}

function changePassword(event) {
  event.preventDefault();
  const form = event.target.elements;
  const user = getCurrentUser();
  if (!user || user.password === undefined) {
    return;
  }

  if (!allFilled(event.target)) {
    showMessage("password-status", "required_fields", true);
    return;
  }
  if (form.next.value !== form.next2.value) {
    showMessage("password-status", "passwords_mismatch", true);
    return;
  }

  if (user.password !== form.current.value) {
    showMessage("password-status", "wrong_current_password", true);
    return;
  }

  user.password = form.next.value;
  saveCurrentUser(user);
  event.target.reset();
  showMessage("password-status", "password_changed");
}

function savePreferences() {
  const user = getCurrentUser();
  if (!user) {
    return;
  }

  user.language = document.querySelector("#pref-lang").value;
  user.notify = document.querySelector("#pref-notify").checked;
  saveCurrentUser(user);

  changeLanguage(user.language);
  showMessage("prefs-status", "saved");
}

function sendContact(event) {
  event.preventDefault();

  if (!allFilled(event.target)) {
    showMessage("contact-status", "suggestion_required", true);
    return;
  }

  showMessage("contact-status", "suggestion_ready");
  event.target.reset();
}

// Botoiak eta formularioak funtzioekin lotzen dira / Connect buttons and forms to functions
// Botoia sakatzean dagokion funtzioa exekutatzen da / Run the matching function when a button is clicked
menuButton.addEventListener("click", function () {
  setMenuOpen(side.hidden);
});

smallScreen.addEventListener("change", function () {
  setMenuOpen(!smallScreen.matches);
});

side.querySelector(".menu").addEventListener("click", function (event) {
  if (smallScreen.matches && event.target.matches("a")) {
    setMenuOpen(false);
  }
});

const langButtons = document.querySelectorAll("[data-lang]");
for (let i = 0; i < langButtons.length; i++) {
  langButtons[i].addEventListener("click", function () {
    changeLanguage(langButtons[i].dataset.lang);
  });
}

document.querySelector("#pref-lang").addEventListener("change", function () {
  changeLanguage(this.value);
});
document.querySelector("#logout-btn").addEventListener("click", logout);
document.querySelector("#fake-login-btn").addEventListener("click", fakeLogin);
document.querySelector("#login-form").addEventListener("submit", login);
document.querySelector("#signup-form").addEventListener("submit", signup);
document.querySelector("#profile-form").addEventListener("submit", saveProfile);
document.querySelector("#password-form").addEventListener("submit", changePassword);
document.querySelector("#prefs-save").addEventListener("click", savePreferences);
document.querySelector("#contact-form").addEventListener("submit", sendContact);

joinForm.addEventListener("change", function () {
  updateJoinDetails();
  showMessage("join-status", "");
});
joinForm.addEventListener("submit", joinEvent);

document.querySelector("main").addEventListener("click", function (event) {
  const link = event.target.closest("[data-join-event]");
  if (link && link.hash === "#join") {
    joinForm.elements.eventChoice.value = link.dataset.joinEvent;
    updateJoinDetails();
  }
});

document.querySelector("#account-btn").addEventListener("click", function () {
  accountMenu.showModal();
});

// Kanpoan edo kontuko esteka batean sakatzean leihoa ixten da / Close the window when clicking outside or on an account link
accountMenu.addEventListener("click", function (event) {
  if (event.target === accountMenu || event.target.closest("a")) {
    closeAccountMenu();
  }
});

// Escape sakatuta, beste leihoa eta mugikorreko menua ixten dira / Escape closes the other window and the mobile menu
document.addEventListener("keydown", function (event) {
  if (event.key === "Escape" && !accountMenu.open) {
    closeTutorPopup();
    if (smallScreen.matches) {
      setMenuOpen(false);
    }
  }
});

document.querySelector("#birth").addEventListener("change", checkBirthDate);
document.querySelector("#tutor-form").addEventListener("submit", saveTutor);
document.querySelector("#tutor-cancel").addEventListener("click", closeTutorPopup);

window.addEventListener("hashchange", showPage);

// Weba martxan jartzen da / Start the website
// Hasierako menua, hizkuntza eta atala prestatzen dira / Set up the initial menu, language and section
setMenuOpen(!smallScreen.matches);
updateLanguage();
updateTopBar();
showPage();
