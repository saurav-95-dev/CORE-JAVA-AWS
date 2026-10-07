/*

IAM Policy Structure :
{
  "Version": "2012-10-17",
  "Id": "Optional",
  "Statement": [
    {
      "Sid": "Optional",
      "Effect": "Allow or Deny",
      "Principal": "Optional",
      "Action": "Action or NotAction",
      "Resource": "Resource or NotResource",
      "Condition": "Optional"
    }
  ]
}

# AWS-CLI - 3 options - AWS Management Console, AWS CLI, AWS SDK

# IAM Roles in AWS :

->Some AWS Services will perform action on our behalf , and to do so, we will assign permission to aws service with IAM Roles.
->IAM Role is kind of like a user, but they are not intended to be used by physical
people, but instead, they will be used by AWS Services.
->Common Roles - EC2 Instance Roles, Lamda Function Roles, Roles for CloudFormation.
->For any service for example EC2 - we have IAM Role with permission attahced to it which will try to access some service
in AWS . If the permission attached to that IAM role is correct , then it will be able to call the required service from AWS.

# EBS Volumme :
-> EBS Volume are bound in a specific AZ.
-> EBS snapshots features - SS Archive, Recycle Bin, Fast SS Restore (FSR)

# EBS Snapshots :
-> We can create EBS volume accross different regions.
-> Multi-attach feature - only available for io1/io2 family.
-> Can allow upto 16 instance at a time.
-> Must use file system that is cluster aware.

# EFS - Elatic File System :
-> Use content management,  web serving, data sharing, Word-Press.
-> Only Compatible with LINUX Based AMI.

#LOAD BALANCER (servers) - ELB - Elastic Load balancer.
- REASON TO USE ELB:
-> Load Balancer has health check machanism through which it can determine which instance it has to send traffic to.
-> It can provide SSL termination (HTTPS) for your websites.
-> It can also separate public traffic from private traffic.

- TYPES OF MANAGES LOAD BALANCER ON AWS:
1)Classic Load balancer.
2)Application load balancer.
3)Network load balancer.
4)Gateway load balancer.

# APPLICATION LOAD BALANCER:
->Application load balancer - for - Micro-services and container-based application (eg-Docker and Amazon ECS)

# Amazon Route 53 :
-> Route 53 is also a Domain Registrar(mean you can register your domain name).
-> Ability to check the health of your resources.
-> Only AWS Service that provide 100% Availability.
-> 53 is a reference to traditional DNS port.

Route 53 Records :
-Domain/Subdomain name
-Record type
-Value of the record.
-Routing policy.
-TTL
-A/AAAA/CNAME/NS

Route 53 important record type:
-A : hostname - ipv4
-AAAA : hostname - ipv6
-CNAME : HOSTNAME - HOSTNAME
-NS : Name server for hosted zone

*TTL is mandatory for each DNS record except for alias record.

#Routing Policy for Route 53:
1)Simple (no health checks)
2)Weighted (health checks - YES)
3)Latency (health checks -YES)
4)GeoLocation
5)Geoproximity (apply bias to specific resource in a specific region)
6)IP-Based - when you know client IP ahead of time.
7)Multivalue.
8)Failover

CNAME VS Alias :
- Both are basically record type .
-CNAME -
-Points a host name to another hostname.
-They are only for non-root domain
-Alias -
-Points a host name to aws resource.
-They are for both root as well as non-root domain.
-Also free of charge.
-Native health check available.
** We can't set TTL for Alias records.

# Routing Policy-Facts :
1)Simple:
-Specify mutiple ip in the same record.
-When alias is enabled , specify only on aws resource

- Health-Checks:
->There are total 15 global health-checks that monitor an endpoint.
-> if >18% of the healthchecks report endpoint as healthy , then Route 53 considers it healthy.

Latency based Routing vs Geolocation based Routing:
->latency - based on traffic b/t users and aws regin whereas later is based purely on user geographical location.
->Geolocation - Website localization , restrict content distribution.

# Geoproximity - Route traffic to a particular resource in a specific region based on defined bias on that resource.

# IP-Based Routing - Has a set of CIDRs values (with corresponding endpoint/location).

# Mutivalue - Can help to route to mutiple resources on different regions.
-Will always return healthy rsponse (upto 8)

# Classic Solution Architecture:
-Elastic BeanStalk :
-> Developer centric view of deploying an application.
-> It uses components like - EC2 , ASG , ELB , RDS etc.
->Is a managed service
->Automatically handles - provision capacity , load balancing , scaling , app health checks, instance configuration

BeanStalk Components:
-Application - Collection of Elastic Beanstalk components - env , versions , configurations..
-Aplication version.
-Environment - Collection of aws resources running an application version.
-Tiers - Web server env tier and worker env tier
-Can create multiple env.

** Web server env Tier - utilises ELB - talks to EC2 instance.
** Worker env tier - use SQS queue to talk to EC2 instances.

- Elastic BeanStalk Deployment modes:
->Single instance(uses Elastic IP) and High availability with load balancer(uses application load balancer).

# Amazon S3 :
->infinitely scaling bucket.
->Backup and storage , Disaster recovery, Archive , Hybrid cloud storage, media hosting, static hosting, application hosting,data lakes / big data analytics

#Amazon S3 Buckets-
->buckets -> objects(files) -- keys (full path of the object)
->Objects -> Contain -> meta-data , tags , versions .


#S3 Bucket security-
->User based - IAM Roles.
->resource based - bucket policies , object access control list , bucket access control list.
->encryption

#S3 Replication :
->Enable versioning required in source and target bucket
->Cross region replication.
->same region replication.
->Copying will be asynchronous .
->S3 must have proper IAM permission.


*/





































