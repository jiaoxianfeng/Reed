export function test_log() {
  console.log(11111111111)
}

export function axios_post(item, url, props) {
  this.axios({
    method: 'post',
    url: url,
    data: props,
    crossDomain: true
  }).then(body =>{
    item = body;
  });
}
