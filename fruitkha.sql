-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Feb 20, 2022 at 08:09 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fruitkha`
--

-- --------------------------------------------------------

--
-- Table structure for table `address`
--

CREATE TABLE `address` (
  `id` int(11) NOT NULL,
  `user` int(9) NOT NULL,
  `street` varchar(225) NOT NULL,
  `city` varchar(225) NOT NULL,
  `pincode` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `article`
--

CREATE TABLE `article` (
  `id` int(11) NOT NULL,
  `name` varchar(1000) NOT NULL,
  `image` varchar(225) NOT NULL,
  `info` text NOT NULL,
  `user` varchar(225) NOT NULL,
  `date` varchar(225) NOT NULL,
  `tags` varchar(1000) NOT NULL,
  `count` int(11) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `article`
--

INSERT INTO `article` (`id`, `name`, `image`, `info`, `user`, `date`, `tags`, `count`, `status`) VALUES
(1, 'We\'re living some strange times', '1.jpg', 'We\'re living some strange times This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.', 'Admin', '15 January 2022', 'something-something2-something3', 0, 1),
(2, 'Dreaming of Las Vegas Crazyness', '2.jpg', 'Dreaming of Las Vegas Crazyness This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.', 'Admin', '16 January 2022', 'some1-some2-some3', 0, 1),
(3, 'The beauty of this world is in your heart', '3.jpg', 'The beauty of this world is in your heart This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.', 'Admin', '16 January 2022', 'some1-some2-some3', 0, 1),
(4, 'San Francisco at its best view in all seasons', '4.jpg', 'San Francisco at its best view in all seasons This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.', 'Admin', '16 January 2022', 'some1-some2-some3', 0, 1),
(5, 'Autumn doesn\'t have to be nostalgic, you know?\r\n', '5.jpg', 'Autumn doesn\'t have to be nostalgic, you know?\r\nThis is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.', 'Admin', '14 January 2022', 'any1-any-any4', 0, 1),
(6, 'Little red dress and a perfect summer', '47685506.jpg', 'Little red dress and a perfect summer  Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sint soluta, similique quidem fuga vel voluptates amet doloremque corrupti. ', 'Bhupendra', 'January 28,2022', 'tages2-rteh3-gdgdr-5', 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `id` int(11) NOT NULL,
  `user` int(11) NOT NULL,
  `product` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`id`, `user`, `product`, `quantity`, `status`) VALUES
(2, 1, 1, 3, 1),
(4, 1, 6, 10, 1);

-- --------------------------------------------------------

--
-- Table structure for table `clients`
--

CREATE TABLE `clients` (
  `id` int(11) NOT NULL,
  `name` varchar(225) NOT NULL,
  `image` varchar(225) NOT NULL,
  `title` varchar(225) NOT NULL,
  `discription` varchar(225) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `clients`
--

INSERT INTO `clients` (`id`, `name`, `image`, `title`, `discription`, `status`) VALUES
(1, 'Bhupendra sambare', '1624854038644.jpeg', 'Tester and Developer', 'JAVA (Spring MVC + JDBC)| PHP (Laravel | CI) developer looking for opportunity', 1),
(2, 'Bhupendra sambare', '73044361624854038644.jpeg', 'Java Spring Developer', 'Developing new thing via new ways are way cool to look forward tghe things to do.', 1),
(3, 'Cetificate for java', '63774520001 2.jpg', 'Simplilearn', 'Simplilearn certificate of completiong follofing cource', 1),
(4, 'gsgfg', '5346489WhatsApp Image 2022-01-11 at 1.48.46 AM.jpeg', 'sgddsgdgsaadgs', 'gasdgsdgsdgs', 1),
(5, 'Code modofied', '827925360013266.jpeg', 'skjdnkdkjndfkjsnkdfsgk', 'jkdhskjnkdjsnkdsbnus', 1);

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `id` int(11) NOT NULL,
  `name` varchar(225) NOT NULL,
  `date` varchar(225) NOT NULL,
  `comment` text NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `id` int(11) NOT NULL,
  `name` varchar(225) NOT NULL,
  `email` varchar(225) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `subject` varchar(225) NOT NULL,
  `message` text NOT NULL,
  `type` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`id`, `name`, `email`, `phone`, `subject`, `message`, `type`) VALUES
(1, 'Bhupendra sambare', 'bhupendrasa.1404@gmail.com', '9516138020', 'Jquery Form Submit check', 'Check the Form submit with Ajax', 'feedback'),
(2, 'Bhupendra', 'Test2@gmail.com', '8976758746', 'Test 2nd', 'This is the second test for modification check', 'feedback');

-- --------------------------------------------------------

--
-- Table structure for table `footer`
--

CREATE TABLE `footer` (
  `id` int(11) NOT NULL,
  `about` varchar(1000) NOT NULL,
  `address` varchar(225) NOT NULL,
  `email` varchar(225) NOT NULL,
  `phone` varchar(225) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `footer`
--

INSERT INTO `footer` (`id`, `about`, `address`, `email`, `phone`, `status`) VALUES
(1, 'java Developer waying forward to make myself better', 'Rajendra nagar, indore, Indore', 'bhupendrasam1404@gmail.com', '+91 9516138020', 1),
(2, 'second to test', 'sdkkjdskjdfskj ds kjkj kjn jdfs js', 'dslfjdgksdfjsh@fdsnkjsc', 'fjkdsjkdf340980944', 1),
(3, 'java Developer waying forward to make myself better', 'Rajendra nagar, indore, Indore', 'bhupendrasam1404@gmail.com', '+91 9516138020', 1);

-- --------------------------------------------------------

--
-- Table structure for table `fruits`
--

CREATE TABLE `fruits` (
  `id` int(11) NOT NULL,
  `name` varchar(225) NOT NULL,
  `image` varchar(225) NOT NULL,
  `unit` varchar(225) NOT NULL,
  `price` int(11) NOT NULL,
  `discription` text NOT NULL,
  `categories` varchar(1000) NOT NULL,
  `count` int(11) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fruits`
--

INSERT INTO `fruits` (`id`, `name`, `image`, `unit`, `price`, `discription`, `categories`, `count`, `status`) VALUES
(1, 'Strawberry', '1150136product-img-1.jpg', 'kg', 85, 'This is the discription of the Strawberry products', 'Strawberry', 1000, 1),
(2, 'Small Strawberry', '4891700product-img-6.jpg', 'kg', 80, 'This is Discription Of second Strawberry', 'Strawberry', 1000, 1),
(3, 'Berry', '6339884product-img-2.jpg', 'kg', 70, 'This is the Discription of Berry', 'Berry', 400, 1),
(4, 'Lemon', '5763669product-img-3.jpg', 'Piece', 1, 'This is Discription of Lemon', 'Lemon', 5000, 1),
(5, 'Avocado', '4622172product-img-4.jpg', '100gm', 10, 'This is the Discription of Avocado', 'Avocado', 2000, 1),
(6, 'Green Apple', '9253502product-img-5.jpg', 'Piece', 2, 'This is discrion of Green Apple', 'greenapple', 4000, 1);

-- --------------------------------------------------------

--
-- Table structure for table `paragraph`
--

CREATE TABLE `paragraph` (
  `id` int(11) NOT NULL,
  `news` int(11) NOT NULL,
  `data` text NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `socialmedia`
--

CREATE TABLE `socialmedia` (
  `id` int(11) NOT NULL,
  `name` varchar(225) NOT NULL,
  `logo` varchar(225) NOT NULL,
  `link` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `socialmedia`
--

INSERT INTO `socialmedia` (`id`, `name`, `logo`, `link`) VALUES
(1, 'bhupendrasambare', 'fab fa-linkedin', 'https://www.linkedin.com/in/bhupendrasambare/'),
(2, 'bhupendra.sambare', 'fab fa-instagram', 'https://www.instagram.com/bhupendra.sambare/'),
(3, 'bhupendra_sam', 'fab fa-twitter', 'https://twitter.com/bhupendra_SAM');

-- --------------------------------------------------------

--
-- Table structure for table `subscriber`
--

CREATE TABLE `subscriber` (
  `id` int(11) NOT NULL,
  `email` varchar(225) NOT NULL,
  `date` varchar(225) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subscriber`
--

INSERT INTO `subscriber` (`id`, `email`, `date`, `status`) VALUES
(1, 'bhupendra@gmail.com', '2022-01-17', 1),
(2, 'sambare@gmail.com', '2022-01-17', 1),
(3, 'TestFinal@gmail.com', '2022-01-17', 1);

-- --------------------------------------------------------

--
-- Table structure for table `team`
--

CREATE TABLE `team` (
  `id` int(11) NOT NULL,
  `name` varchar(225) NOT NULL,
  `title` varchar(225) NOT NULL,
  `image` varchar(225) NOT NULL,
  `facebook` varchar(225) NOT NULL,
  `twitter` varchar(225) NOT NULL,
  `instagram` varchar(225) NOT NULL,
  `linkedin` varchar(225) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `team`
--

INSERT INTO `team` (`id`, `name`, `title`, `image`, `facebook`, `twitter`, `instagram`, `linkedin`, `status`) VALUES
(1, 'Bhupendra sambare', 'Main Developer', '713521660013266.jpeg', 'https://www.facebook.com/bhupendra.sambare/', 'https://twitter.com/bhupendra_SAM', 'https://www.instagram.com/bhupendra.sambare/', 'https://www.linkedin.com/in/bhupendrasambare', 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(225) NOT NULL,
  `email` varchar(225) NOT NULL,
  `password` varchar(225) NOT NULL,
  `image` varchar(225) NOT NULL,
  `phone` varchar(225) NOT NULL,
  `gender` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `email`, `password`, `image`, `phone`, `gender`) VALUES
(1, 'Bhupendra Sambare', 'bhupendrasam1404@gmail.com', 'bhupendra', '511760360013266.jpeg', '9516138020', '1');

-- --------------------------------------------------------

--
-- Table structure for table `userlikes`
--

CREATE TABLE `userlikes` (
  `id` int(11) NOT NULL,
  `user` int(11) NOT NULL,
  `product` int(11) NOT NULL,
  `count` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `article`
--
ALTER TABLE `article`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `feedback`
--
ALTER TABLE `feedback`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `footer`
--
ALTER TABLE `footer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `fruits`
--
ALTER TABLE `fruits`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `paragraph`
--
ALTER TABLE `paragraph`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `socialmedia`
--
ALTER TABLE `socialmedia`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `subscriber`
--
ALTER TABLE `subscriber`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `team`
--
ALTER TABLE `team`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `userlikes`
--
ALTER TABLE `userlikes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `address`
--
ALTER TABLE `address`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `article`
--
ALTER TABLE `article`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `cart`
--
ALTER TABLE `cart`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `clients`
--
ALTER TABLE `clients`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `comments`
--
ALTER TABLE `comments`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `feedback`
--
ALTER TABLE `feedback`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `footer`
--
ALTER TABLE `footer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `fruits`
--
ALTER TABLE `fruits`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `paragraph`
--
ALTER TABLE `paragraph`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `socialmedia`
--
ALTER TABLE `socialmedia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `subscriber`
--
ALTER TABLE `subscriber`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `team`
--
ALTER TABLE `team`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `userlikes`
--
ALTER TABLE `userlikes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
