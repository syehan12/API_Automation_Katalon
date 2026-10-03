import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable

def response = WS.sendRequest(
    findTestObject(
        'Pet/GET_Pet_By_ID',
        [
            ('petId'): GlobalVariable.petId
        ]
    )
)

println("Status Code: " + response.getStatusCode())
println("Response Body: " + response.getResponseBodyContent())

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(
    response,
    'id',
    GlobalVariable.petId
)

WS.verifyElementPropertyValue(
    response,
    'name',
    'Bobby'
)

WS.verifyElementPropertyValue(
    response,
    'status',
    'available'
)
