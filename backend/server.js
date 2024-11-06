const express = require('express');

const app = express();

app.use(express.json())

app.get('/post', (req, res) => {
  // res.send('Successfull response.');
  res.status(200).send({
    id: "1",
    title: "hello",
    date:"123",
    content: "anbdiniolnwdioniwos",
    cate: "posted"
  })
});


app.listen(3000, () => console.log('Example app is listening on port 3000.'));
