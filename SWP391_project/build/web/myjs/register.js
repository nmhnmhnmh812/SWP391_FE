const email = document.getElementById('email');
const password = document.getElementById('password');
const cfpassword = document.getElementById('cfpassword');
const notiErr = document.getElementsByClassName('login_valid');
const phone = document.getElementById('phonenumbers');
const fullname = document.getElementById('fullname');
const address = document.getElementById('address');


const handleValidateEmail = () => {
    const regex = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/
    if (email.value.match(regex)) {
        email.classList.remove('is-invalid')
        email.classList.add('is-valid')
    } else {
        email.classList.add('is-invalid')
        email.classList.remove('is-valid')
        notiErr[0].innerHTML = 'This is not a valid email address'
    }
}

const handleValidatePass = () => {
    if (password.value.length < 5 || password.value.length > 25) {
        password.classList.add('is-invalid')
        password.classList.remove('is-valid')
        notiErr[1].innerHTML = 'Password must be at least 6 characters and at most 25 characters'
    } else {
        password.classList.remove('is-invalid')
        password.classList.add('is-valid')
    }
}

const handleValidateCFPass = () => {
    if (cfpassword.value !== password.value) {
        cfpassword.classList.add('is-invalid')
        cfpassword.classList.remove('is-valid')
        notiErr[2].innerHTML = 'Confirm password does not match the password'
    } else {
        cfpassword.classList.remove('is-invalid')
        cfpassword.classList.add('is-valid')
    }
}

const handleValidatePhone = () => {
    const regex = /^\d{10}$/
    if (phone.value.match(regex)) {
        phone.classList.remove('is-invalid')
        phone.classList.add('is-valid')
    } else {
        phone.classList.add('is-invalid')
        phone.classList.remove('is-valid')
        notiErr[4].innerHTML = 'Phone numbers must be 10 digits'
    }
}

const handleValidateFullname = () => {
    if (fullname.value !== '') {
        fullname.classList.remove('is-invalid')
        fullname.classList.add('is-valid')
    } else {
        fullname.classList.add('is-invalid')
        fullname.classList.remove('is-valid')
        notiErr[3].innerHTML = 'Name must not be empty'
    }
}

const handleValidateAddress = () => {
    if (address.value !== '') {
        address.classList.remove('is-invalid')
        address.classList.add('is-valid')
    } else {
        address.classList.add('is-invalid')
        address.classList.remove('is-valid')
        notiErr[5].innerHTML = 'Address must not be empty'
    }
}