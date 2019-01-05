CREATE TABLE bin_table
(
  bin_id                          int      NULL,
  bin_number                      tinytext NULL,
  card_type                       tinytext NULL,
  card_level                      tinytext NULL,
  card_brand                      tinytext NULL,
  bank_issuing                    tinytext NULL,
  bank_country_name               tinytext NULL,
  bank_country_two_alfa_code      tinytext NULL,
  bank_country_three_alfa_code    tinytext NULL,
  bank_country_three_numeric_code tinytext NULL,
  bin_groups                      tinytext NULL,
  blocked                         int      NULL,
  error                           int      NULL,
  message                         tinytext NULL
);