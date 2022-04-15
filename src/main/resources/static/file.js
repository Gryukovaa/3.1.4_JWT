fetch('http://localhost:8080/test')
    .then(response => response.json())
    .then(data => {

        alert(data)


    })