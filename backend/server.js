const express = require('express');

const app = express();
const postRouter = require("./routes/post")
const commentRouter = require("./routes/comment")
const pageRouter = require("./routes/page")


app.use('/post', postRouter);
app.use('/comment', commentRouter);
app.use('/page', pageRouter);


app.listen(3000, () => console.log('Example app is listening on port 3000.'));
