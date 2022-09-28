const btn_seemore = document.getElementById('btn_seemore')
const seemorepart = document.querySelector('.seemore')
const listItemMentorCard = document.getElementsByClassName('card-mentor')


// display list item of technologies as default
const defaultDisplayItemMentor = () => {
    if (listItemMentorCard.length > 8) {
        seemorepart.classList.remove('disable')
        for (let i = 8; i < listItemMentorCard.length; i++) {
            listItemMentorCard[i].classList.add('disable')
        }
    } else {
        seemorepart.classList.add('disable')
    }
                console.log('hello')

}

defaultDisplayItemMentor()

// handle load more items and see less items
const handleDisplayItemMentor = () => {
    if (listItemMentorCard.length > 8) {
        for (let i = 8; i < listItemMentorCard.length; i++) {
            listItemMentorCard[i].classList.toggle('disable')
        }
        if (listItemMentorCard[listItemMentorCard.length - 1].classList.contains('disable')) {
            btn_seemore.innerHTML = 'See All &#9207;'

        } else {
            btn_seemore.innerHTML = 'See Less &#9206;'
        }
    }
}