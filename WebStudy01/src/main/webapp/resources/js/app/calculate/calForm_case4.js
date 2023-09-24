/**
 * 
 */
$(function(){ // $(document).on("load|ready",function(){});
	let selectValue = $(calForm.operator).data("initValue");
	$(calForm.operator).val(selectValue);
	
	$(calForm).on('submit',function (event){
		event.preventDefault();
		let url = this.action;
		let method = this.method;
		let data = $(this).serializeJSON(); // query String
		console.log("serializeJSON 함수 결과",data);
		let json = JSON.stringify(data);
		console.log("data marshalling",json);
		let settings = {
			url : url,
			method : method,
			data : json,
			dataType : "html", // Accept Request Header : Content-Type Response Header
			contentType : "application/json;charset=utf-8",
			success : function(resp) {
				$(resultArea).html(resp)
			},
			error : function(jqXhr, status, error) {
				console.log("jqXhr : ", jqXhr);
				console.log("status : ", status);
				console.log("error : ", error);
			}
		};
		$.ajax(settings);
		return false;
	});
})