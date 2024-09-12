# Write an SQL query that reports the average experience years of all the employees for each project, rounded to 2 digits.
# Return the result table in any order.
#
# Table: Project
# +-------------+---------+
# | Column Name | Type    |
# +-------------+---------+
# | project_id  | int     |
# | employee_id | int     |
# +-------------+---------+
#
# Table: Employee
# +------------------+---------+
# | Column Name      | Type    |
# +------------------+---------+
# | employee_id      | int     |
# | name             | varchar |
# | experience_years | int     |
# +------------------+---------+


SELECT project_id, ROUND(AVG(e.experience_years), 2) as average_years
    FROM Project p
    LEFT JOIN Employee e
    ON p.employee_id = e.employee_id
    GROUP BY p.project_id
