function roleList(data) {

    var role =''
    if(data.roles.length > 1) {
       role = data.roles[0].role + ',' + data.roles[1].role
    }
    else {
        role = data.roles[0].role
    }

    return role;
}