var GettingInfoAboutComputer = function (id) {
    var service = 'http://localhost:8080/computer';

    $.ajax({
        type: 'GET',
        url: service + '/get/' + id,
        dataType: 'json',
        async: false,
        success: function (result) {
            $('#response').html(JSON.stringify(result))
        },
        error: function (jqXHR, testStatus, errorThrown) {
            $('#response').html(JSON.stringify(jqXHR))
        }
    });
}

var UpdateComputer = function (armName, description, domainName, name, phone, userDescription) {
    JSONObject = {
        "armName": armName,
        "description": description,
        "domainName": domainName,
        "name": name,
        "phone": phone,
        "userDescription": userDescription
    };

    $.ajax({
        type: "POST",
        url: "http://localhost:8080/user/rest/check/for/update/info",
        contentType: "application/json;utf-8",
        data: JSON.stringify(JSONObject),
        dataType: "json",
        async: false,
        success: function (result) {
            if (result != 0) {
                $('#response').html("Not correct data: " + GetReason(result));
            } else {
                //data is correct, update user
                $.ajax({
                    type: "PUT",
                    url: "http://localhost:8080/user/rest/update/info",
                    contentType: "application/json;utf-8",
                    data: JSON.stringify(JSONObject),
                    dataType: "json",
                    async: false,
                    success: function (result) {
                        $('#response').html("")
                    },
                    error: function (jqXHR, testStatus, errorThrown) {
                        $('#response').html(JSON.stringify(jqXHR))
                    }
                });

            }
        },
        error: function (jqXHR, testStatus, errorThrown) {
            $('#response').html(JSON.stringify(jqXHR))
        }
    });
}

var OnChange = function () {
    $('#response').html("data were changing")
}

