fetch('http://localhost:8080/users/u')
    .then(response => response.json())
    .then(data => {
            console.log(data)
            let table = ""
            let role = data.roles[0].role

            table += ('<tr id="list">')
            table += ('<td>' + data.id + '</td>')
            table += ('<td>' + data.firstname+ '</td>')
            table += ('<td>' + data.lastname + '</td>')
            table += ('<td>' + data.email + '</td>')
            table += ('<td>' + role)

            table += ('</tr>')

            console.log(table)
            $('#user_table').append(table)
            $('#show_user').html(data.firstname + ' with role: ' + role)
    })
