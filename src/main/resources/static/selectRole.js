function selectRole(selector){
    let roles = $(selector).val()
    let roleID
    if (roles[0] === 'ROLE_ADMIN'){
        roleID = 2
    } else {
        roleID = 1
    }
    roles =[{
        id: roleID,
        role: roles[0]
    }]
    console.log(roles[0])
    return roles
}