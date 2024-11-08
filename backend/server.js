const express = require('express');

const app = express();
const postRouter = require("./routes/post")
const commentRouter = require("./routes/comment")
const pageRouter = require("./routes/page")
const media = require("./routes/media")


app.use('/post', postRouter);
app.use('/comment', commentRouter);
app.use('/page', pageRouter);
app.use('/media',media);
app.use('/media', express.static('img'));



app.listen(3000, () => console.log('Example app is listening on port 3000.'));
