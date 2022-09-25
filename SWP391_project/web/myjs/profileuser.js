const form_input = document.getElementsByClassName('form-control-active')
const contain_gender = document.querySelector('.contain-form-gender')
const gender = document.querySelector('.gender-value')
const btn_update_profile = document.querySelector('.Profile_btn_update')
const upload_avt = document.querySelector('.upload-avt')


const handleUpdateProfile = () => {
    for (var i = 0; i < form_input.length; i++) {
        form_input[i].removeAttribute('disabled')
    }

    contain_gender.style.display = 'block'
    gender.style.display = 'none'
    btn_update_profile.style.display = 'block'
    upload_avt.style.display = 'block'
}

const handleDisableProfile = (e) => {
    e.preventDefault()
    for (var i = 0; i < form_input.length; i++) {
        form_input[i].setAttribute('disabled', '')
    }

    contain_gender.style.display = 'none'
    gender.style.display = 'block'
    btn_update_profile.style.display = 'none'
    upload_avt.style.display = 'none'
}
