## Part 1: Test it with SQL
SHOW columns from techjobs.job;

## Part 2: Test it with SQL
SELECT name FROM techjobs.employer
WHERE location = "St. Louis City";

## Part 3: Test it with SQL
DROP TABLE techjobs.job;

## Part 4: Test it with SQL
SELECT techjobs.skill.name, techjobs.skill.skill_description
FROM techjobs.skill
INNER JOIN techjobs.job_skills ON techjobs.skill.id = techjobs.job_skills.skills_id;