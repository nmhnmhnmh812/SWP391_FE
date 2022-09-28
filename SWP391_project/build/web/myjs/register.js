const email = document.getElementById('email');
const username = document.getElementById('username');
const password = document.getElementById('password');
const cfpassword = document.getElementById('cfpassword');
const notiErr = document.getElementsByClassName('login_valid');
const phone = document.getElementById('phonenumbers');
const fullname = document.getElementById('fullname');
const address = document.getElementById('address');
const form_input = document.getElementsByClassName('form-input');
const btn_submit = document.querySelector('.btn-submit');


const handleBlurEmail = () => {
    if (email.value === '')
        email.classList.remove('is-invalid')
}

const handleBlurPass = () => {
    if (password.value === '')
        password.classList.remove('is-invalid')
}

const handleBlurCfpass = () => {
    if (cfpassword.value === '')
        cfpassword.classList.remove('is-invalid')
}

const handleBlurNum = () => {
    if (phone.value === '')
        phone.classList.remove('is-invalid')
}


const handleValidateEmail = () => {
    const regex = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/
    if (email.value.match(regex)) {
        email.classList.remove('is-invalid')
        email.classList.add('is-valid')
        btn_submit.removeAttribute('disabled')
    }
    else {
        email.classList.add('is-invalid')
        email.classList.remove('is-valid')
        notiErr[0].innerHTML = 'This is not a valid email address'
        btn_submit.setAttribute('disabled', '')
    }
}

const handleValidatePass = () => {
    if (password.value.length < 5 || password.value.length > 25) {
        password.classList.add('is-invalid')
        password.classList.remove('is-valid')
        notiErr[2].innerHTML = 'Password must be at least 6 characters and at most 25 characters'
        btn_submit.removeAttribute('disabled')
    }
    else {
        password.classList.remove('is-invalid')
        password.classList.add('is-valid')
        btn_submit.setAttribute('disabled', '')
    }
}

const handleValidateCFPass = () => {
    if (cfpassword.value !== password.value) {
        cfpassword.classList.add('is-invalid')
        cfpassword.classList.remove('is-valid')
        notiErr[3].innerHTML = 'Confirm password does not match the password'
        btn_submit.removeAttribute('disabled')
    }
    else {
        cfpassword.classList.remove('is-invalid')
        cfpassword.classList.add('is-valid')
        btn_submit.setAttribute('disabled', '')
    }
}

const handleValidatePhone = () => {
    const regex = /^\d{10}$/
    if (phone.value.match(regex)) {
        phone.classList.remove('is-invalid')
        phone.classList.add('is-valid')
        btn_submit.removeAttribute('disabled')
    }
    else {
        phone.classList.add('is-invalid')
        phone.classList.remove('is-valid')
        notiErr[5].innerHTML = 'Phone numbers must be 10 digits'
        btn_submit.setAttribute('disabled', '')
    }
}

const handleValidateUsername = () => {
    if (username.value !== '') {
        username.classList.remove('is-invalid')
        username.classList.add('is-valid')
        btn_submit.removeAttribute('disabled')
    }
    else {
        username.classList.add('is-invalid')
        username.classList.remove('is-valid')
        notiErr[1].innerHTML = 'Username must not be empty'
        btn_submit.setAttribute('disabled', '')
    }
}

const handleValidateFullname = () => {
    if (fullname.value !== '') {
        fullname.classList.remove('is-invalid')
        fullname.classList.add('is-valid')
        btn_submit.removeAttribute('disabled')
    }
    else {
        fullname.classList.add('is-invalid')
        fullname.classList.remove('is-valid')
        notiErr[4].innerHTML = 'Name must not be empty'
        btn_submit.setAttribute('disabled', '')
    }
}

const handleValidateAddress = () => {
    if (address.value !== '') {
        address.classList.remove('is-invalid')
        address.classList.add('is-valid')
        btn_submit.removeAttribute('disabled')
    }
    else {
        address.classList.add('is-invalid')
        address.classList.remove('is-valid')
        notiErr[6].innerHTML = 'Address must not be empty'
        btn_submit.setAttribute('disabled', '')
    }
}
